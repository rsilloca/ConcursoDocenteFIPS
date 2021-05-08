package edu.unsa.concursodocente.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;

@Data
@Entity
public class Nota {
    @Id
    private long id;

    @OneToOne
    @MapsId
    @JoinColumn(name = "concursante_id")
    private Concursante concursante;
    
    private int notaFinal;
    private int N1;
    private int N2;

    @OneToMany(mappedBy = "nota")
    private Set<NotaClase> notasClase;
    private boolean estado;
}
