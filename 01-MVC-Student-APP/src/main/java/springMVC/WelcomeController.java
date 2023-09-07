package springMVC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	
	@RequestMapping("/click")
	public String sayHi() {
		System.out.println("It's okay think once.");
		return "welcome";
	}

}
