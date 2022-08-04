package koreanAir.copy.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import koreanAir.copy.model.MemberVO;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@GetMapping("/signUp")
	public String join() {
		return "member/signUp";
	}

	@PostMapping("/signUp")
	public String register(@Valid MemberVO member, Errors errors) {
		// MemberVO객체  
		 
		return "redirect:success";
	}
	
	// 마이 페이지 
	@GetMapping("/myPage/{userId}")
	public String mypage(@PathVariable String userId) {
		return "member/myPage";
	}
}
