package koreanAir.copy.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import koreanAir.copy.mapper.MemberMapper;
import koreanAir.copy.model.MemberVO;

@Component
public class CustomUserDetailService implements UserDetailsService{

	@Autowired
	MemberMapper mapper;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		MemberVO memberVO = mapper.read(username);
		System.out.println(memberVO);
		if(memberVO==null) {
			throw new UsernameNotFoundException(username);
		}
		return new CustomUser(memberVO);
	}

}
