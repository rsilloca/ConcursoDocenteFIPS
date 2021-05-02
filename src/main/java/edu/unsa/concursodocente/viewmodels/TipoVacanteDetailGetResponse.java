package edu.unsa.concursodocente.viewmodels;

import edu.unsa.concursodocente.models.Concurso;
import edu.unsa.concursodocente.models.TipoVacante;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TipoVacanteDetailGetResponse {
	
	private long id;
	private String nombre;
	private String descripcion;
	
	  public static TipoVacanteDetailGetResponse of(TipoVacante tipoVacante) {
	        var response = builder()
	            .id(tipoVacante.getId())
	            .nombre(tipoVacante.getNombre())
	            .descripcion(tipoVacante.getDescripcion())
	            .build();
	        return response;
	    }

}
