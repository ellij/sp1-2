package server.s2021.sp12.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	@RequestMapping("hello")
	@ResponseBody
	public String returnGreeting(@RequestParam(name = "location") String location,
			@RequestParam(name = "firstname") String firstname) {
		return "Welcome to the " + location + " " + firstname + "!";
	}

}
