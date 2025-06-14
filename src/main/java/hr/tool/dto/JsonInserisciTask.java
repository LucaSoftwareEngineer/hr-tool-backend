package hr.tool.dto;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonInserisciTask {

	private String descrizione;
	private Date data;
	private Boolean completata;
	private Long idDipendente;
	
}
