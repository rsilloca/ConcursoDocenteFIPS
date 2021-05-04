package edu.unsa.concursodocente.viewmodels;

import java.util.Date;

import lombok.Data;

@Data
public class ConcursoFechaPostRequest {
    private long concursoId;
    private Date fecha;
}
