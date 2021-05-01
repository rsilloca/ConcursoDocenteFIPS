package edu.unsa.concursodocente.viewmodels;

import java.util.List;

import lombok.Data;

@Data
public class PlazaGetResponse {
    private long id;
    private String tipo;
    private String regimen;
    private String departamentoAcademico;
    private List<String> requerimientos;
    private List<String> asignaturas;
}
