package edu.unsa.concursodocente.viewmodels;

import edu.unsa.concursodocente.models.Nota;
import edu.unsa.concursodocente.models.NotaClase;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class NotaDetailGetResponse {
    private long id;
    private int notaF;
    private int N1;
    private int N2;

    public static NotaDetailGetResponse of (Nota nota){
        var response = builder()
                .id(nota.getId())
                .notaF(nota.getNotaFinal())
                .N1(nota.getN1())
                .N2(nota.getN2())
                .build();
        return response;
    }
}
