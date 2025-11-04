package hr.tool.controllers;

import hr.tool.dto.JsonEsito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<JsonEsito> inserisci(@RequestBody JsonInserisciPresenza json) {
		return ResponseEntity.ok(new JsonEsito(presenzaService.inserisci(json)));
	}
	
	@DeleteMapping("api/presenza/elimina")
	public ResponseEntity<JsonEsito> elimina(@RequestParam Long idPresenza) {
		return ResponseEntity.ok(new JsonEsito(presenzaService.elimina(idPresenza)));
	}
	
}
