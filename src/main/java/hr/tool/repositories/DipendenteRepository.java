package hr.tool.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import hr.tool.models.Dipendente;

public interface DipendenteRepository extends JpaRepository<Dipendente, Long> {

	@Query(
			" SELECT d FROM Dipendente d " +
			" WHERE IdDipendente = :IdDipendente "
	)
	public Dipendente FindByIdDipendente(Long IdDipendente);
	
}
