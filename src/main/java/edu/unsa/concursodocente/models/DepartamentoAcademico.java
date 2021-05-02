package edu.unsa.concursodocente.models;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class DepartamentoAcademico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nombre;

    @Temporal(TemporalType.DATE)
    private Date created;

    @Temporal(TemporalType.DATE)
    private Date modified;

    @OneToMany(mappedBy = "departamentoAmericano", cascade = CascadeType.ALL)
    private List<Plaza> plazas;
}
