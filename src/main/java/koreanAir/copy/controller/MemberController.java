package koreanAir.copy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

	@PostMapping("/register")
	public String register(@Valid MemberVO memberVO, Errors errors) {
		new MemberValidator().validate(memberVO, errors);
		if (errors.hasErrors()) {
			return "join/register";
		}
		return "redirect:success";
	}
}
