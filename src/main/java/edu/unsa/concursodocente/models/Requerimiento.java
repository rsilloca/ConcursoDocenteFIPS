package edu.unsa.concursodocente.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Requerimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @ManyToMany(mappedBy = "requerimientos")
    List<Plaza> plazas;
    @Column(nullable = false)
    private String nombre;

    public Requerimiento(String nombre){
        this.nombre = nombre;
    }
}
