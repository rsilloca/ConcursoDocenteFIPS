package edu.unsa.concursodocente.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contest {
    @Id
    private long id;
    private int academicYear;
    private Date callDate;
    private Date ballotDrawDate;
    private Date masterClassDate;
    private Date facultyCouncilDate;
}
