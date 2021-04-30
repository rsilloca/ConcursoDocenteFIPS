package edu.unsa.concursodocente.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;

@Data
@Entity
public class Applicant {
    @Id
    private long id;
    
    @Temporal(TemporalType.DATE)
    private Date registrationDate;
}
