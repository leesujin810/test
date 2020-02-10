package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControlller {
	@RequestMapping("/hello")
	public String hello(Model m,String regid, String msg) {
		System.out.println("regid:"+regid);
		System.out.println("msg:"+msg);
		m.addAttribute("msg",msg);
		return "hello";
	}
}