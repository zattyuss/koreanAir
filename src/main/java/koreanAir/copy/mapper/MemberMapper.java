package koreanAir.copy.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import koreanAir.copy.model.MemberVO;

public interface MemberMapper {

	MemberVO read(String userId);
	void insert(MemberVO MemberVO);
	void authenticate(
			@Param("userId") String userId,
			@Param("auth") String auth);
}
