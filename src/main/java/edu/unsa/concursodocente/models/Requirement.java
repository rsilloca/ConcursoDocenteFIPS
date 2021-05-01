package edu.unsa.concursodocente.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Requirement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

}
