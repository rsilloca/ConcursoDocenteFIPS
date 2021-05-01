package edu.unsa.concursodocente.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Jefferson Farfán
 * @version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Plaza {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany(cascade = CascadeType.ALL)
    private List<Requerimiento> requerimientos;
    @Column(nullable = false)
    private int number;
    //private Regimen regimen;
    //private DepartamentoAcadémico departamentoAcadémico;
    //private Concurso concurso;

    public Plaza(int number){
        this.number = number;
    }
}
