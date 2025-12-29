package kr.or.ddit.member1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member1")
public class Member1Controller {

	// member1 작업
	@GetMapping("/start")
	public String member1Start() {
		return "member1/start";
	}
	
	// member1 작업
	@GetMapping("/start6")
	public String member1Start6(Model model) {
		model.addAttribute("param", "member1-start6-parameter");
		return "member1/start";
	}
	
}
