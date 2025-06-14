package hr.tool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import hr.tool.models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
