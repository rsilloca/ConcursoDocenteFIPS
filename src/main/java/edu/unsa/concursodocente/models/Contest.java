package edu.unsa.concursodocente.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Contest {
    @Id
    private long id;

    private int academicYear;

    @Temporal(TemporalType.DATE)
    private Date callDate;

    @Temporal(TemporalType.DATE)
    private Date ballotDrawDate;

    @Temporal(TemporalType.DATE)
    private Date masterClassDate;

    @Temporal(TemporalType.DATE)
    private Date facultyCouncilDate;
}
