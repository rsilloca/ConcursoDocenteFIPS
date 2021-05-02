package edu.unsa.concursodocente.viewmodels;

import edu.unsa.concursodocente.models.Regimen;
import edu.unsa.concursodocente.models.TipoVacante;
import lombok.Data;

@Data
public class TipoVacantePostRequest {
	public String nombre;
	public String descripcion;
	
	
	public TipoVacante toTipoVacante(){
        var tipoVacante = new TipoVacante();
        tipoVacante.setNombre(this.nombre);
        tipoVacante.setDescripcion(this.descripcion);
        return tipoVacante;
    }
}
