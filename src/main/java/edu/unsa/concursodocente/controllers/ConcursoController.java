package edu.unsa.concursodocente.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import edu.unsa.concursodocente.models.Cronograma;
import edu.unsa.concursodocente.repositories.ConcursoRepository;
import edu.unsa.concursodocente.repositories.CronogramaRepository;
import edu.unsa.concursodocente.viewmodels.ConcursoDetailGetResponse;
import edu.unsa.concursodocente.viewmodels.ConcursoFechaPostRequest;
import edu.unsa.concursodocente.viewmodels.ConcursoPostRequest;

@RestController
public class ConcursoController {
    @Autowired
    private ConcursoRepository repository;
    @Autowired
    private CronogramaRepository cronRepo;

    @GetMapping("concursos/")
    public List<ConcursoDetailGetResponse> getConcursos() {
        var response = repository.findAll().stream()
                .map(concurso -> ConcursoDetailGetResponse.of(concurso))
                .map(detail -> {

                    return detail;
                }).collect(Collectors.toList());
        return response;
    }

    @PostMapping("concursos/")
    public void createConcurso(@RequestBody ConcursoPostRequest request) {
        var nuevoConcurso = request.toConcurso();
        repository.save(nuevoConcurso);
    }

    @PostMapping("concursos/{id}/fecha-inicio")
    public void añadirFechaInicio(long id, @RequestBody ConcursoFechaPostRequest request) {
        var concurso = repository.findById(id).orElseThrow();
        if (concurso.getCronograma() == null) {
            concurso.setCronograma(new Cronograma());
            concurso.getCronograma().setFechaInicio(request.getFecha());
        }
        repository.save(concurso);
    }
}
