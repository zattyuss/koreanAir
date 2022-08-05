package koreanAir.copy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import koreanAir.copy.model.MemberVO;
import koreanAir.copy.service.MemberService;

@Controller
@RequestMapping("/member")
public class MemberController {
	
	@Autowired
	private MemberService service;
	
	
	@GetMapping("/signUp")
	public String join() {
		return "member/signUp";
	}

	@PostMapping("/signUp")
	public String register(MemberVO member) {
		service.register(member);
		return "redirect:/";
	}
	
	// 마이 페이지 
	@GetMapping("/myPage/{userId}")
	public String mypage(@PathVariable String userId) {
		return "member/myPage";
	}
	
	// 아이디 조회
	@GetMapping("/idCheck/{userId}")
	@ResponseBody
	public boolean findByUserId(@PathVariable String userId) {
		MemberVO findById = service.findById(userId);
		if(findById!=null) {
			System.out.println("아이디 중복이다");
			return false;
		}
		return true; 
	}
}
