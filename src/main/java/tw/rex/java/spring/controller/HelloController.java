package tw.rex.java.spring.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping; //這裡使用GetMapping
import org.springframework.web.bind.annotation.RequestMapping; 


import tw.rex.java.spring.service.UserService;


@Controller
@RequestMapping("hello")
public class HelloController {
	
	@Autowired
	private UserService us;
	
	@GetMapping //這裡使用GetMapping
	public void printHelloSpring(ModelMap model){
		model.addAttribute("user", us.getUsername());
		model.addAttribute("msg", "Hello Spring!");
		model.addAttribute("time", new Date().toString());
	}
	
	//@GetMapping
	public void printHelloWorld(ModelMap model){
		model.addAttribute("user", us.getUsername2());
		model.addAttribute("msg", "Hello Word!");
		model.addAttribute("time", new Date().toString());
	}	
}
