package edu.unsa.concursodocente.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class DepartamentoAcadémico {
    @Id
    private int id;

    private String nombre;

    @Temporal(TemporalType.DATE)
    private Date created;
    
    @Temporal(TemporalType.DATE)
    private Date modified;
}
