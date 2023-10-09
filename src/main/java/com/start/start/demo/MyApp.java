package com.start.start.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyApp {
	
	@GetMapping("/")
	public String  ShowForm(Model model) {
		model.addAttribute("book", new Books());
		return "ShowForm";
		
		}
	
	@PostMapping("/register")
	public String submit(@ModelAttribute Books book,Model model) {
		int price = book.getPrice();
		int pricewithgst = price+18;
		
		model.addAttribute("model", book);
		return "confirmation";
	}
	
	

}
