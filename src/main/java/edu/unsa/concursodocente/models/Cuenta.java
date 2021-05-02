package edu.unsa.concursodocente.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Cuenta {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;
	 private String email;
	 private String password;
	
	 @OneToOne
	 @MapsId
	 private Concursante concursante;
	 
	 
	 @OneToOne
	 @MapsId
	 private Evaluador evaluador;
}
