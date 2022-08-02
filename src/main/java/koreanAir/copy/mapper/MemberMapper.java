package koreanAir.copy.mapper;

import koreanAir.copy.model.MemberVO;

public interface MemberMapper {

	MemberVO read(String userId);
}
