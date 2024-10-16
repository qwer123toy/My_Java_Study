package kr.co.greenart.index;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyQuizController {

//	@RequestMapping(value = "/myQuiz", method = RequestMethod.GET)
	@GetMapping(value="/myQuiz")
	public String myForm() {

		return "myQuiz";
	}

//	@RequestMapping(value = "/myQuiz", method = RequestMethod.POST)
	@PostMapping(value="/myQuiz")
	public String result(@RequestParam(value = "num1") int num1,
			@RequestParam(value = "num2", defaultValue = "0") int num2, Model model) {

		int sum = num1 + num2;
		int minus = num1 - num2;
		int multiple = num1 * num2;
		double divide = (double) num1 / (double) num2;

		model.addAttribute("sum", sum);
		model.addAttribute("minus", minus);
		model.addAttribute("multiple", multiple);
		model.addAttribute("divide", divide);

		return "resultQuiz";
	}
}
