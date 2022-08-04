package koreanAir.copy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import koreanAir.copy.mapper.MemberMapper;
import koreanAir.copy.model.AuthVO;
import koreanAir.copy.model.MemberVO;

@Service
public class MeberServiceImpl implements MemberService {

	@Autowired
	MemberMapper mapper;
	
	@Override
	@Transactional
	public void register(MemberVO memberVO) {
		mapper.insert(memberVO);
		String userId = memberVO.getUserId();
		memberVO.getAuthList().forEach(v-> mapper.authenticate(userId,v.getAuth()));
	}

}
