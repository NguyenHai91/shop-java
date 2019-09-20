package com.hainguyen.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.hainguyen.service.UserService;



@Controller
@RequestMapping("login")
public class AuthenticationController {

	@GetMapping
	public String Login() {
		return "Login";
	}

	
	
	@Autowired
	UserService  userService;
	
	@PostMapping
	@Transactional
	public String Login(@RequestParam String email, @RequestParam String password) {
		System.out.println("ok");
		boolean checkLogin = userService.CheckLogin(email, password);
		if (checkLogin) {
			System.out.println("Login ok");
		} else {
			System.out.println("Login faild");
		}
		return "redirect:/login";
		
	}

//	@GetMapping
//	public String GetRegistor() {
//		return "Registor";
//	}
//	
//	@Autowired
//	SessionFactory sessionFactory;
//	
//	
//	@PostMapping
//	@Transactional
//	public String Registor(@RequestParam String name, @RequestParam String address, @RequestParam String email, @RequestParam String password, @RequestParam String repassword) {
//		
//		if (password.equals(repassword) && name != "" && email != "" && password != "") {
//			System.out.print("ok");
//			Session session = sessionFactory.getCurrentSession();
//			List<User> users = session.createQuery("from User").getResultList();
//			for (User user : users) {
//				System.out.println(user.getName());
//				
//			}
//			
//			return "redirect:/Login";
//		} else {
//			System.out.print("ok");
//			return "redirect:/";
//		}
//	}

}





































