package hr.tool.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hr.tool.dto.JsonInserisciPresenza;
import hr.tool.services.PresenzaService;

@RestController
public class PresenzaController {

	@Autowired
	PresenzaService presenzaService;
	
	@PostMapping("api/presenza/inserisci")
	public Boolean inserisci(@RequestBody JsonInserisciPresenza json) {
		return presenzaService.inserisci(json);
	}
	
	@DeleteMapping("api/presenza/elimina")
	public Boolean elimina(@RequestParam Long idPresenza) {
		return presenzaService.elimina(idPresenza);
	}
	
}
