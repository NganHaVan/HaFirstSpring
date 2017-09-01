package havan.server.firstProject.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller // This is the controller class
@ResponseBody
public class helloController {
	@RequestMapping("/contacts") // Which path controller is listening to. It
									// means only http://localhost:8080/contacts
									// works
	public String hello() {
		return "Hello World from Spring";
	}

	@RequestMapping("/index")
	public String helloIndex() {
		return "Hello Index from Spring";
	}

	@RequestMapping("/hello")
	public String helloUser(@RequestParam(name = "location", required = false, defaultValue = "World") String location,
			@RequestParam(name = "name", required = false, defaultValue = "Users") String name) {
		return "Welcome to the " + location + " " + name + "!";

	}
}