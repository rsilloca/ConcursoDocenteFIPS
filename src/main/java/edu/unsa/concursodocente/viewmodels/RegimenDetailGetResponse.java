package edu.unsa.concursodocente.viewmodels;

import edu.unsa.concursodocente.models.Regimen;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RegimenDetailGetResponse {
	private long id;
	private String nombre;
	private String descripcion;
	
	
	public static RegimenDetailGetResponse of (Regimen regimen) {
		var response = builder()
	            .id(regimen.getId())
	            .nombre(regimen.geNombre())
	            .descripcion(regimen.getDescripcion())
	            .build(); 
		return response;
	}

}
