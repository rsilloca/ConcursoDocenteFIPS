package edu.unsa.concursodocente.controllers;

import java.util.List;
import java.util.stream.Collectors;

import edu.unsa.concursodocente.viewmodels.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.unsa.concursodocente.models.Concurso;
import edu.unsa.concursodocente.models.Cronograma;
import edu.unsa.concursodocente.repositories.ConcursoRepository;
import edu.unsa.concursodocente.repositories.CronogramaRepository;
import edu.unsa.concursodocente.services.ConcursoService;


@RestController
public class ConcursoController {
    @Autowired
    private ConcursoService service;

    @GetMapping("concursos/")
    public List<ConcursoDetailGetResponse> getConcursos() {
        var concursos = service.obtenerTodosLosConcursos();
        return concursos;
    }

    @GetMapping("concursos/{id}")
    public ConcursoDetailGetResponse getConcurso(@PathVariable long id){
        var concurso = service.obtenerConcursoPorId(id);
        return concurso;
    }

    @PostMapping("concursos/")
    public ConcursoDetailGetResponse createConcurso(@RequestBody ConcursoPostRequest request) {
        var concurso = service.guardarConcurso(request);
        return ConcursoDetailGetResponse.of(concurso);
    }

    @PostMapping("concursos/{id}/fechas")
    public void actualizarFechas(long id, @RequestBody CronogramaPostRequest request) {
        service.actualizarCromogramadeConcurso(id, request);
    }
}
