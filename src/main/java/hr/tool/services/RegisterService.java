package hr.tool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hr.tool.dto.JsonRegister;
import hr.tool.models.Amministratore;
import hr.tool.repositories.AmministratoreRepository;

@Service
public class RegisterService {

	@Autowired
	AmministratoreRepository amministratoreRepository;
	
	public Boolean register(JsonRegister json) {
		Amministratore amministratore = new Amministratore(
				null,
				json.getEmail(),
				json.getPassword(),
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
