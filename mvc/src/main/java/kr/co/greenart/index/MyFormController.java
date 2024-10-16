package kr.co.greenart.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyFormController {
	@RequestMapping(value = "/myForm", method = RequestMethod.GET)
	public String myForm() {
		
		return "myForm";
	}
	
	@RequestMapping(value = "/myForm", method = RequestMethod.POST)
	public String result(@RequestParam(value="name") String name,
			@RequestParam(value="age", defaultValue ="0") int age
			, Model model) {
		
		model.addAttribute("name", name);
		model.addAttribute("age", age);
		
		return "result";
	}
	
}
