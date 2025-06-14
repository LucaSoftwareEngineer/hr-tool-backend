package hr.tool.services;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hr.tool.dto.JsonInserisciTask;
import hr.tool.models.Dipendente;
import hr.tool.models.Task;
import hr.tool.repositories.DipendenteRepository;
import hr.tool.repositories.TaskRepository;

@Service
public class TaskService {

	@Autowired
	TaskRepository taskRepository;
	
	@Autowired
	DipendenteRepository dipendenteRepository;
	
	public Boolean inserisci(JsonInserisciTask json) {
		
		Dipendente dipendente = dipendenteRepository.FindByIdDipendente(json.getIdDipendente());
		List<Dipendente> dipendenti = new ArrayList<>();
		dipendenti.add(dipendente);
		
		Task task = new Task(
				null,
				json.getDescrizione(),
				json.getData(),
				json.getCompletata(),
				dipendenti
		);
		
		try {
			taskRepository.save(task);
		} catch (Exception e) {
			return false;
		} 
		
		return true;
	}
	
	public Boolean elimina(Long idTask) {
		try {
			taskRepository.deleteById(idTask);
		} catch (Exception e) {
			return false;
		}
		
		return true;
	}
	
}
