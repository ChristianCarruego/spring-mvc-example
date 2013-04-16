package tallerweb.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld(@RequestParam("nombre") String nombre) {

		String message = "Hola " + nombre + "!";
		return new ModelAndView("hello", "message", message);
	}

}
