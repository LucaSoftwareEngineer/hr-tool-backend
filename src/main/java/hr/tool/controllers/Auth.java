package hr.tool.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import hr.tool.dto.JsonLogin;
import hr.tool.dto.JsonRegister;
import hr.tool.services.LoginService;
import hr.tool.services.RegisterService;

@RestController
public class Auth {

	@Autowired
	LoginService loginService;
	
	@Autowired
	RegisterService registerService;
	
	@PostMapping("api/login")
	public Long login(@RequestBody JsonLogin json) {
		return loginService.login(json.getEmail(), json.getPassword());
	}
	
	@PostMapping("api/register")
	public Boolean register(@RequestBody JsonRegister json) {
		return registerService.register(json);
	}
}
