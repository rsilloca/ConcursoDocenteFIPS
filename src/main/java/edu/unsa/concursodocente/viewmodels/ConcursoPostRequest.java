package edu.unsa.concursodocente.viewmodels;

import edu.unsa.concursodocente.models.Concurso;
import lombok.Data;

@Data
public class ConcursoPostRequest {
    public int añoAcademico;
    public int periodo;

    public Concurso toConcurso(){
        var concurso = new Concurso();
        concurso.setAñoAcadémico(this.añoAcademico);
        concurso.setPeriodo(this.periodo);
        return concurso;
    }
}
