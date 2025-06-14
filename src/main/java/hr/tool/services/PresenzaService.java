package hr.tool.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import hr.tool.dto.JsonInserisciPresenza;
import hr.tool.models.Dipendente;
import hr.tool.models.Presenza;
import hr.tool.repositories.DipendenteRepository;
import hr.tool.repositories.PresenzaRepository;

@Service
public class PresenzaService {

	@Autowired
	PresenzaRepository presenzaRepository;
	
	@Autowired
	DipendenteRepository dipendenteRepository;
	
	public Boolean inserisci(JsonInserisciPresenza json) {
		Dipendente dipendente = dipendenteRepository.FindByIdDipendente(json.getIdDipendente());
		Presenza presenza = new Presenza(
				null,
				json.getData(),
				json.getPresente(),
				dipendente
		);
		try {
			presenzaRepository.save(presenza);
		} catch (Exception e) {
			return false;
		}
		return true;
	}
	
	public Boolean elimina(Long idPresenza) {
		try {
			presenzaRepository.deleteById(idPresenza);
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
	
}
