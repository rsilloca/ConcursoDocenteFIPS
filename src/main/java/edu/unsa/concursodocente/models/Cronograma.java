package edu.unsa.concursodocente.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Cronograma {
    @Id
    private long id;

    @OneToOne(mappedBy = "cronograma")
    private Concurso concurso;

    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

    @Temporal(TemporalType.DATE)
    private Date fechaFin;

    @Temporal(TemporalType.DATE)
    private Date fechaClaseMagistral;

    @Temporal(TemporalType.DATE)
    private Date fechaAprobación;
}
