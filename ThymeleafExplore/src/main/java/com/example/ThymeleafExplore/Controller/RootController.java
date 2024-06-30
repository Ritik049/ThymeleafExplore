package com.example.ThymeleafExplore.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class RootController {
    
	
	@GetMapping
	public String index(Model model)
	{
		  model.addAttribute("pageTitle","Taming Thymeleaf");
		  model.addAttribute("students",List.of("Ram","Shyam","Bhole"));
		  
		  return "index";
	}
}
