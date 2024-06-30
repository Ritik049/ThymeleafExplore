package com.example.StarterThymeleaf.Controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class rootController {
             
	
	public String index (Model model)
	{
		  model.addAttribute("pageTitle","Taming Thymeleaf");
		  model.addAttribute("students",List.of("Ram","Shyam","Bhole"));
		  
		  return "index";
	}
}
