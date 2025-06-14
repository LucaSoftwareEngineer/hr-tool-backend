package hr.tool.controllers;

import org.springframework.beans.factory.annotation.Autowired;
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
	public Boolean inserisci(@RequestBody JsonInserisciTask json) {
		return taskService.inserisci(json);
	}
	
	@DeleteMapping("api/task/elimina")
	public Boolean elimina(@RequestParam Long idTask) {
		return taskService.elimina(idTask);
	}
	
}
