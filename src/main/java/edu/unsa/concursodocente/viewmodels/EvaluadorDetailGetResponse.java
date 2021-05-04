package edu.unsa.concursodocente.viewmodels;

import edu.unsa.concursodocente.models.Evaluador;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class EvaluadorDetailGetResponse {
    private long id;
    private String nombre;
    private String apellido;
    private String dni;
    private String email;
    private String tipo;
    private PlazaGetResponse plaza;

    public static EvaluadorDetailGetResponse of (Evaluador evaluador){
        var response = builder()
                .id(evaluador.getId())
                .nombre(evaluador.getNombre())
                .apellido(evaluador.getApellidos())
                .dni(evaluador.getDni())
                .email(evaluador.getEmail())
                .build();

        if(evaluador.getTipoEvaluador() != null){
            response.setTipo(evaluador.getTipoEvaluador().getNombre());
        }
        return response;
    }
}
