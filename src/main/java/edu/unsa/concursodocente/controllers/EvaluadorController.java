package edu.unsa.concursodocente.controllers;

import edu.unsa.concursodocente.repositories.EvaluadorRepository;
import edu.unsa.concursodocente.viewmodels.EvaluadorDetailGetResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class EvaluadorController {
    @Autowired
    private EvaluadorRepository repository;

    @GetMapping("evaluadores/")
    public List<EvaluadorDetailGetResponse> getInfoEvaluador(){
        var response = repository.findAll().stream()
                .map(evaluador -> EvaluadorDetailGetResponse.of(evaluador))
                .map(detail ->{
                    return detail;
                }).collect(Collectors.toList());
        return response;
    }
}
