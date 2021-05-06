package edu.unsa.concursodocente.viewmodels;

import edu.unsa.concursodocente.models.Concursante;
import edu.unsa.concursodocente.models.Nota;
import lombok.Data;

@Data
public class ConcursantePostRequest {
    private int dni;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private Nota nota;

    public Concursante toConcursante(){
        var concursante = new Concursante();
        concursante.setDni(this.dni);
        concursante.setNombres(this.nombre);
        concursante.setApellidoPaterno(this.apellidoPaterno);
        concursante.setApellidoMaterno(this.apellidoMaterno);
        //concursante.setNota(new Nota());
        return concursante;
    }

}
