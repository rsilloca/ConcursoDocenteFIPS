package edu.unsa.concursodocente.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Nota {
    @Id
    private long id;

    @OneToOne
    @MapsId
    private Concursante concursante;
    
    private int notaFinal;
    private int N1;
    private int N2;
}
