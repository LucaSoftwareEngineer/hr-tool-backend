package hr.tool.models;

import java.sql.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name="presenze")
public class Presenza {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idPresenza;
	private Date data;
	private Boolean presente;
	
	@OneToOne
	private Dipendente dipendente;
	
}
