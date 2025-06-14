package hr.tool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.tool.repositories.AmministratoreRepository;

@Service
public class LoginService {

	@Autowired
	AmministratoreRepository amministratoreRepository;
	
	public Long login(String email, String password) {
		return amministratoreRepository.login(email, password);
	}
	
}
