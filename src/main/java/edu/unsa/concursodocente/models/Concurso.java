package edu.unsa.concursodocente.models;

import javax.persistence.*;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@Data
@EqualsAndHashCode(of="id")
@Entity
public class Concurso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToOne(optional = false, mappedBy = "concurso",cascade = CascadeType.ALL)
    private Cronograma cronograma;
    @OneToMany(mappedBy = "concurso", cascade = CascadeType.ALL)
    private Set<Plaza> plazas;

    private int añoAcadémico;
    private int periodo;
    private boolean estado;

    public Concurso(){
        cronograma = new Cronograma();
        cronograma.setConcurso(this);

        plazas = new HashSet<Plaza>();
    }
}
