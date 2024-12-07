package klu.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequestMapping("/")

public class ClientController {
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mvc=new ModelAndView();
		mvc.setViewName("home.jsp");
		return mvc;
	}
	
	
}
