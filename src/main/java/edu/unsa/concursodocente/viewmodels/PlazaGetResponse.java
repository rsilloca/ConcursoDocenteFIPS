package edu.unsa.concursodocente.viewmodels;

import java.util.List;

import edu.unsa.concursodocente.models.DepartamentoAcademico;
import edu.unsa.concursodocente.models.Plaza;
import edu.unsa.concursodocente.models.Regimen;
import edu.unsa.concursodocente.models.TipoVacante;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class PlazaGetResponse {
    private long id;
    private String tipo;
    private String regimen;
    private String departamentoAcademico;
    private List<String> requerimientos;
    private List<String> asignaturas;

    public static PlazaGetResponse of(Plaza plaza){
        var response = builder()
                .id(plaza.getId())
                .tipo(new TipoVacante().getNombre())
                .regimen(new Regimen().getNombreCroto())
                .departamentoAcademico(new DepartamentoAcademico().getNombre())
                //.requerimientos(plaza.getRequerimientos())
                //.asignaturas(plaza.getAsignaturas())
                .build();
        return response;
    }
}