package edu.unsa.concursodocente.models;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class AcademicDepartment {
    @Id
    private long id;
    private String name;
}
