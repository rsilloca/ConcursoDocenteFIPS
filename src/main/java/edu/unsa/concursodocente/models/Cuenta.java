package edu.unsa.concursodocente.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Data;


@Data
@Entity
public class Cuenta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	long id;
	String email;
	String password;
}
