package koreanAir.copy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/member")
@Controller
public class SampleController {

	@GetMapping("/all")
	public void doAll() {
		System.out.println("모든회원가능");
	}

	@GetMapping("/member")
	public void member() {
		System.out.println("회원가능");
	}
	
	@GetMapping("/admin")
	public void admin() {
		System.out.println("관리자가능");
	}
}
