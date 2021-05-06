package edu.unsa.concursodocente.viewmodels;

import edu.unsa.concursodocente.models.Concursante;
import edu.unsa.concursodocente.models.Nota;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ConcursanteDetailGetResponse{
    private PlazaGetResponse plaza;
    private long id;
    private String nombreCompleto;
    private NotaDetailGetResponse nota;

    public static ConcursanteDetailGetResponse of (Concursante concursante){
        var response = builder()
                .id(concursante.getId())
                .nombreCompleto(concursante.getNombreCompleto())
                .build();
        if(concursante.getPlaza() != null)
            response.setPlaza(PlazaGetResponse.of(concursante.getPlaza()));
        if(concursante.getNota() != null)
            response.setNota(NotaDetailGetResponse.of(concursante.getNota()));
        return  response;
    }
}
