package hr.tool.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name="amministratori")
public class Amministratore {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idAmministratore;
	private String email;
	private String password;
	private String nome;
	private String cognome;

}
