package baiwa.mysql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import baiwa.mysql.service.UsersService;

@RestController
@RequestMapping("users/")
public class UsersController {

	@Autowired
	private UsersService usersService;

	@GetMapping("test")
	public String test() {
		usersService.save();
		return "SS";
	}
}
