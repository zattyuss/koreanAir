package koreanAir.copy.mapper;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import koreanAir.copy.model.MemberVO;

public class MemberMapperTest {

	@Autowired
	MemberMapper mapper;
	
	@Test
	public void selectMemberTest() {
		MemberVO read = mapper.read("member");
		System.out.println(read);
		read.getAuthList().forEach(System.out::println);
	}
}
