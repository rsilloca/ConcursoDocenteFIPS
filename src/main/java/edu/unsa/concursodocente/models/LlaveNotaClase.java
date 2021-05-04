package edu.unsa.concursodocente.models;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Embeddable
public class LlaveNotaClase implements Serializable{
    private Long notaId;
    private Long evaluadorId; 
}
