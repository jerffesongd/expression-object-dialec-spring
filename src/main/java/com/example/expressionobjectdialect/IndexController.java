package com.example.expressionobjectdialect;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	@GetMapping
	public String index (Model model) {
		
		Random numberRandom = new Random();
		model.addAttribute("numberRandom", numberRandom.nextInt());
		
		return "index";
		
	}
	
}
