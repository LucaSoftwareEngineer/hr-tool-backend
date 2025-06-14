package hr.tool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import hr.tool.models.Amministratore;

public interface AmministratoreRepository extends JpaRepository<Amministratore, Long> {

	@Query(
			" SELECT idAmministratore FROM Amministratore " +
			" WHERE email = :email AND password = :password "
	)
	public Long login(String email, String password);
	
}
