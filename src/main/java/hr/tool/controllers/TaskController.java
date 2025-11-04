package hr.tool.controllers;

import hr.tool.dto.JsonEsito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hr.tool.dto.JsonInserisciTask;
import hr.tool.services.TaskService;

@RestController
public class TaskController {

	@Autowired
	TaskService taskService;
	
	@PostMapping("api/task/inserisci")
	public ResponseEntity<JsonEsito> inserisci(@RequestBody JsonInserisciTask json) {
		return ResponseEntity.ok(new JsonEsito(taskService.inserisci(json)));
	}
	
	@DeleteMapping("api/task/elimina")
	public ResponseEntity<JsonEsito> elimina(@RequestParam Long idTask) {
		return ResponseEntity.ok(new JsonEsito(taskService.elimina(idTask)));
	}
	
}
