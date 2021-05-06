package edu.unsa.concursodocente.viewmodels;

import java.util.Set;

import edu.unsa.concursodocente.models.Concursante;
import lombok.Data;

@Data
public class InfoPlazaGetResponse {
	
	private String nombrePlaza;
	private Set<Concursante>concursantes;

}
