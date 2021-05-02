package edu.unsa.concursodocente.viewmodels;

import edu.unsa.concursodocente.models.Concursante;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ConcursanteDetailGetResponse{
    private long id;
    private String nombreCompleto;
    private String email;

    public static ConcursanteDetailGetResponse of (Concursante concursante){
        var response = builder()
                .id(concursante.getId())
                .nombreCompleto(concursante.getNombreCompleto())
                .email(concursante.getEmail())
                .build();
        return  response;
    }
}
