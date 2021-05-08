package edu.unsa.concursodocente.models;

import lombok.Data;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Data
@Entity
public class NotaClase {
    @EmbeddedId
    private LlaveNotaClase id;

    @ManyToOne
    @MapsId("notaId")
    private Nota nota;

    @ManyToOne
    @MapsId("evaluadorId")
    private Evaluador evaluador;

    private int notaEvaluador;
    private boolean estado;
}
