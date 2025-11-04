package hr.tool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import hr.tool.models.Amministratore;

import java.util.Optional;

public interface AmministratoreRepository extends JpaRepository<Amministratore, Long> {

	public Optional<Amministratore> findByEmail(String email);
	
}
