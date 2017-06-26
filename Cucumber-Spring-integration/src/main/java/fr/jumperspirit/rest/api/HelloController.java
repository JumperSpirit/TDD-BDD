package fr.jumperspirit.rest.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping(method={RequestMethod.GET},value={"/sayhello"})
	public String sayHello() {
		return "HELLO";
	}

}
