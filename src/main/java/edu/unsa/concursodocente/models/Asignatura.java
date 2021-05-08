package edu.unsa.concursodocente.models;

import javax.persistence.*;

import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
@Entity
public class Asignatura {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Plaza> plazas;
    private String nombre;
    private boolean estado;
    //edu.unsa.concursodocente.models.Asignatura.plaza in edu.unsa.concursodocente.models.Plaza.asignaturas
}
