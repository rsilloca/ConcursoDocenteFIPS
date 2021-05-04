package edu.unsa.concursodocente.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.unsa.concursodocente.models.Concurso;
import edu.unsa.concursodocente.models.Cronograma;
import edu.unsa.concursodocente.repositories.ConcursoRepository;
import edu.unsa.concursodocente.viewmodels.ConcursoDetailGetResponse;
import edu.unsa.concursodocente.viewmodels.ConcursoPostRequest;
import edu.unsa.concursodocente.viewmodels.CronogramaPostRequest;

@Service
public class ConcursoService {
    @Autowired
    private ConcursoRepository concursoRepository;

    public List<ConcursoDetailGetResponse> obtenerTodosLosConcursos(){
        var concursos = concursoRepository.findAll()
            .stream()
            .map(c -> ConcursoDetailGetResponse.of(c))
            .collect(Collectors.toList());
        return concursos;
    }

    public ConcursoDetailGetResponse obtenerConcursoPorId(long id){
        var concurso = concursoRepository.findById(id).orElseThrow();
        return ConcursoDetailGetResponse.of(concurso);
    }

    public Concurso guardarConcurso(ConcursoPostRequest request){
        var concurso = request.toConcurso();
        concursoRepository.save(concurso);
        return concurso;
    }

    public Cronograma actualizarCromogramadeConcurso(long concursoId, CronogramaPostRequest request){
        var concurso = concursoRepository.findById(concursoId).orElseThrow();
        request.updateCronograma(concurso.getCronograma());
        concursoRepository.save(concurso);
        return concurso.getCronograma();
    }
}
