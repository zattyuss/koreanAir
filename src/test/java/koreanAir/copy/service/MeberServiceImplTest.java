package koreanAir.copy.service;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import koreanAir.copy.AppTest;
import koreanAir.copy.model.AuthVO;
import koreanAir.copy.model.MemberVO;

public class MeberServiceImplTest extends AppTest {

	@Autowired
	MemberService service;
	
	@Test
	public void authenticateTest() {
		MemberVO vo = new MemberVO();
		vo.setUserId("what");
		vo.setUserPw("1234");
		vo.setUserName("박현정");
		vo.setUserNameEng("park");
		vo.setEmail("park@naver.com");
		vo.setDateOfBirth("1999.11.12");
		vo.setPhoneNumber("010-5118-7511");
		vo.setCountryOfResidence("대한민국");
		List<AuthVO> authList = new ArrayList<AuthVO>();
		AuthVO auth1 = new AuthVO(); 
				auth1.setAuth("ROLE_MEMBER");
		AuthVO auth2 = new AuthVO();
				auth2.setAuth("ROLE_MANAGER");
		authList.add(auth1);
		authList.add(auth2);
		vo.setAuthList(authList);
		service.register(vo);
	}

}
