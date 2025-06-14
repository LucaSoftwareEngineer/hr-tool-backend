package hr.tool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.tool.dto.JsonDipendente;
import hr.tool.models.Dipendente;
import hr.tool.repositories.DipendenteRepository;

@Service
public class DipendenteService {

	@Autowired
	DipendenteRepository dipendenteRepository;
	
	public Boolean inserisci(JsonDipendente json) {
		
		Dipendente dipendente = new Dipendente(
				null,
				json.getEmail(),
				json.getPassword(),
				json.getNome(),
				json.getCognome(),
				json.getDataNascita(),
				json.getDataAssunzione(),
				json.getDataLicenziamento(),
				json.getNumeroTelefono()
		);
		
		try {
			dipendenteRepository.save(dipendente);
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
	
	public Boolean elimina(Long idDipendente) {
		try {
			dipendenteRepository.deleteById(idDipendente);;
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
	
}
