package hr.tool.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonDipendente {

	private String email;
	private String password;
	private String nome;
	private String cognome;
	private Date dataNascita;
	private Date dataAssunzione;
	private Date dataLicenziamento;
	private String numeroTelefono;
	
}
