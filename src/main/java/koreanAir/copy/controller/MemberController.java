package koreanAir.copy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import koreanAir.copy.model.MemberVO;

@Controller
@RequestMapping("/join")
public class MemberController {
	
	@GetMapping("/success")
	public String success() {
		return "join/success";
	}
	
	@GetMapping("/register")
	public String registerForm(MemberVO memberVO) {
		return "join/register";
	}

	
}
