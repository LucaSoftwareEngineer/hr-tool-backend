package hr.tool.dto;

import java.sql.Date;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JsonInserisciPresenza {

	private Date data;
	private Boolean presente;
	private Long idDipendente;
	
}
