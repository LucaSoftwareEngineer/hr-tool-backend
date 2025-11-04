package hr.tool.controllers;

import hr.tool.dto.JsonEsito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
	public ResponseEntity<JsonEsito> inserisci(@RequestBody JsonDipendente json) {
		return ResponseEntity.ok(new JsonEsito(dipendenteService.inserisci(json)));
	}
	
	@DeleteMapping("api/dipendente/elimina")
	public ResponseEntity<JsonEsito> elimina(@RequestParam Long idDipendente) {
		return ResponseEntity.ok(new JsonEsito(dipendenteService.elimina(idDipendente)));
	}
	
}
