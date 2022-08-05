package koreanAir.copy.service;

import koreanAir.copy.model.MemberVO;

public interface MemberService {

	void remove(MemberVO memberVO);
	void modify(MemberVO memberVO);
	void register(MemberVO memberVO);
	
	
}
