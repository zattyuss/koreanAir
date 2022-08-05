package koreanAir.copy.mapper;

import org.apache.ibatis.annotations.Param;

import koreanAir.copy.model.MemberVO;

public interface MemberMapper {

	MemberVO read(String userId);
	void update(MemberVO memberVO);
	void delete(MemberVO membeVO);
	void insert(MemberVO memberVO);
	void authenticate(
			@Param("userId") String userId,
			@Param("auth") String auth);
}
