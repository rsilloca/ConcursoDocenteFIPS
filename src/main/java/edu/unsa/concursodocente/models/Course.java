package edu.unsa.concursodocente.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Course {
    @Id
    private long id;
    private String name;
}
