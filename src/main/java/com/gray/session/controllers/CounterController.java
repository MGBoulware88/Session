package com.gray.session.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CounterController {

	@RequestMapping("/")
	public String index(HttpSession session) {
		//if session counter not exist, add it
		//if does exist, ++
		if (session.getAttribute("count") == null) {
			session.setAttribute("count", 1);
			
		} else {
			int currentCount = (int) session.getAttribute("count");
			currentCount++;
			session.setAttribute("count", currentCount);
		}
		System.out.println(session.getAttribute("count"));
		return "index.jsp";
		
	}
	
	@RequestMapping("/counter")
	public String counter(HttpSession session) {
		if (session.getAttribute("count") != null) {
			int visitCount = (int) session.getAttribute("count");
			System.out.println("The visit count is: " + visitCount);
			
		} else {
			int visitCount = 0;
			System.out.println("The visit count is: " + visitCount);
		}
		return "counter.jsp";
	}
	
	@RequestMapping("/reset")
	public String reset(HttpSession session) {
		//don't need to check if exist, does nothing if not exist
		session.removeAttribute("count");
		
		System.out.println(session.getAttribute("count"));
		return "reset.jsp";
	}
}
