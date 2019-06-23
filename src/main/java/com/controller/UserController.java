package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pojo.User;
import com.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@RequestMapping("/add")
	public String user_Add(Model model,User user) {
		System.out.println("执行添加方法");
		boolean flag=userService.user_Add(user);
		if(flag)
			model.addAttribute("msg", "success");
		else
			model.addAttribute("msg", "fail");
		return "add";
	}
	@RequestMapping("/input")
	public String input() {
		System.out.println("执行添加方法");
		return "input";
	}
	@RequestMapping("/chat")
	public String chat() {
		return "chat";
	}
	@RequestMapping("/userList")
	public String userlist(Model model) {
		List<User> list=userService.userlist();
		model.addAttribute("list", list);
		return "userlist";
	}
}
