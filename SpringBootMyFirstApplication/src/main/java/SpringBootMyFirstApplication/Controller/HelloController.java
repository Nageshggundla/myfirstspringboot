package SpringBootMyFirstApplication.Controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SpringBootMyFirstApplication.Models.Topics;

@RestController
public class HelloController {

	@RequestMapping("/topics")
	public List<Topics> getTopics(){
		
		return Arrays.asList(
					new Topics("Spring", "Spring Framework", "SpringBoot Application"),
					new Topics("Angular", "Angular Framework", "Angular Application"),
					new Topics("NodeJS", "NodeJS Framework", "NodeJS Application"),
					new Topics("Struts", "Struts Framework", "Struts Application")
				);
	}
	
	@RequestMapping("/")
	public String sayHi() {
		return "Hello";
	}
}
