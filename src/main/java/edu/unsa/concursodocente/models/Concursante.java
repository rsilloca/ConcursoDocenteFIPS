package edu.unsa.concursodocente.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Concursante {
    @Id
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Nota nota;

    private int dni;

    private String nombres;
    private String apellidoPaterno;
    private String apellidoMaterno;

    public String getNombreCompleto() {
        return nombres + " " + apellidoPaterno + " " + apellidoPaterno;
    }
}
