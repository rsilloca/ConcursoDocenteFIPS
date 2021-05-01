package edu.unsa.concursodocente.viewmodels;

import java.util.Date;
import java.util.List;

import edu.unsa.concursodocente.models.Concurso;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ConcursoDetailGetResponse {
    private long id;
    private int añoAcademico;
    private int periodo;
    private Date fechaInicio;
    private Date fechaFinal;
    private List<PlazaGetResponse> plazas;

    public static ConcursoDetailGetResponse of(Concurso concurso) {
        var response = builder()
            .id(concurso.getId())
            .añoAcademico(concurso.getAñoAcadémico())
            .periodo(concurso.getPeriodo())
            .build();

        if(concurso.getCronograma() != null){
            response.setFechaInicio(concurso.getCronograma().getFechaInicio());
            response.setFechaFinal(concurso.getCronograma().getFechaFin());
        }
        return response;
    }
}
