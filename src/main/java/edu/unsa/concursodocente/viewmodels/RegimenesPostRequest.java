package edu.unsa.concursodocente.viewmodels;

import edu.unsa.concursodocente.models.Concurso;
import edu.unsa.concursodocente.models.Regimen;
import lombok.Data;

@Data
public class RegimenesPostRequest {
	public String nombre;
	public String descripcion;
	
	
	public Regimen toConcurso(){
        var regimen = new Regimen();
        regimen.setNombre(this.nombre);
        regimen.setDescripcion(this.descripcion);
        return regimen;
    }
}
