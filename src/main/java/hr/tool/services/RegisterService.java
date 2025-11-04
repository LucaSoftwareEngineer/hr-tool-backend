package hr.tool.services;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import hr.tool.dto.JsonRegister;
import hr.tool.models.Amministratore;
import hr.tool.repositories.AmministratoreRepository;

@Service
@RequiredArgsConstructor
public class RegisterService {

	private final AmministratoreRepository amministratoreRepository;
	private final PasswordEncoder passwordEncoder;
	
	public Boolean register(JsonRegister json) {
		Amministratore amministratore = new Amministratore(
				null,
				json.getEmail(),
				passwordEncoder.encode(json.getPassword()),
				json.getNome(),
				json.getCognome()
		);
		
		try {
			amministratoreRepository.save(amministratore);
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
	
}
