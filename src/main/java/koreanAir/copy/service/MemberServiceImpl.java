package koreanAir.copy.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import koreanAir.copy.mapper.MemberMapper;
import koreanAir.copy.model.AuthVO;
import koreanAir.copy.model.MemberVO;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberMapper mapper;
	
	@Autowired
	PasswordEncoder passwordEncoder; 
	
	@Override
	@Transactional
	public void register(MemberVO memberVO) {
		// 패스워드 인코딩
		String pwEncoding = passwordEncoder.encode(memberVO.getUserPw());
		memberVO.setUserPw(pwEncoding);
		
		// 회원등록
		mapper.insert(memberVO);
		
		// 권한 등록
		memberVO.setAuthList(new ArrayList<AuthVO>());
		memberVO.getAuthList().add(new AuthVO("ROLE_MEMBER"));
		String userId = memberVO.getUserId();
		memberVO.getAuthList().forEach(v-> mapper.authenticate(userId,v.getAuth()));
	}

	@Override
	public void modify(MemberVO memberVO) {
		mapper.update(memberVO);
	}

	@Override
	public void remove(MemberVO memberVO) {
		mapper.delete(memberVO);
	}

}
