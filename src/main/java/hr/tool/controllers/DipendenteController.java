package hr.tool.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hr.tool.dto.JsonDipendente;
import hr.tool.services.DipendenteService;

@RestController
public class DipendenteController {
	
	@Autowired
	DipendenteService dipendenteService;

	@PostMapping("api/dipendente/inserisci")
	public Boolean inserisci(@RequestBody JsonDipendente json) {
		return dipendenteService.inserisci(json);
	}
	
	@DeleteMapping("api/dipendente/elimina")
	public Boolean elimina(@RequestParam Long idDipendente) {
		return dipendenteService.elimina(idDipendente);
	}
	
}
