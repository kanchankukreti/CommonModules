package com.xworkz.commonmodule.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.xworkz.commonmodule.dto.LoginDTO;
import com.xworkz.commonmodule.service.MilitaryService;
import org.springframework.ui.Model;

@Component
@RequestMapping("/")
public class LoginController {
	@Autowired
	private MilitaryService MilitaryService;

	public void MilitaryController() {
		System.out.println("Calling from Controller....");
	}
	@RequestMapping(value = "homeLoginCheck.do", method = RequestMethod.POST)
	public String loginCheck(@RequestParam LoginDTO loginDTO, Model model) {

		int valid = MilitaryService.loginCheck(loginDTO);
		if (valid == 0) {
			return "Userpage";
		} else {
			System.out.println("Data invalid");
			model.addAttribute("Error", "data invalid check valid data");
			return "HomePage";
		}
	}
}
