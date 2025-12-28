package kr.or.ddit.member1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
public class Member1Controller {

	// member1 작업
	// Member1Controller 설정 및 초기 페이지 작성
	@GetMapping("/start")
	public String member1Start() {
		return "member1/start";
	}
	
}
