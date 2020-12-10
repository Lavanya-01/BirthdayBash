/**
 * 
 */
package com.birthday.birthdaybash.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.birthday.birthdaybash.entity.Abhi;
import com.birthday.birthdaybash.entity.Users;
import com.birthday.birthdaybash.repository.AbhiRepo;
import com.birthday.birthdaybash.repository.UserRepo;



@Controller
public class HomeController {
	
	@Autowired
	private AbhiRepo repo;
	
	@Autowired
	private UserRepo urepo;

	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Home- Smart Contact Manager");
		return "home";
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		Abhi login = new Abhi();
		model.addAttribute("login", login);
		
		return "login";
	}
	
	@RequestMapping("/clogin")
	public String clogin(@ModelAttribute Abhi log, Model model ) {
		
		List<Abhi> users = repo.findAll();
		Optional<Abhi> user = users.stream().filter(e -> e.getaName().equals(log.getaName()) && 
				              e.getaPassword().equals(log.getaPassword())).findAny();
		if(user.isPresent())
			return "foodies";
		else
		return "login";
	}
	
	
	@RequestMapping(value = "/mem", method = RequestMethod.GET)
	public String bash(Model model) {
		
		//Users user = repo.findByaName(name)
		model.addAttribute("bash", urepo.findAll());
		//System.out.println(repo.findAll());
		return "bash";
	}
	
	@RequestMapping("/foodies")
	public String foodies(Model model) {
		model.addAttribute("title", "Home- Smart Contact Manager");
		return "foodies";
	}
	
	@RequestMapping("/add")
	public String add(Model model) {
		model.addAttribute("title", "Home- Smart Contact Manager");
		model.addAttribute("user", new Users());
		return "add";
	}
	
	
	@RequestMapping(value = "/do_add" , method =RequestMethod.POST)
	public String doAdd( @ModelAttribute("user") Users user ,Model model) {
		urepo.save(user);
		model.addAttribute("user",user);
		return "home";
	}
}
