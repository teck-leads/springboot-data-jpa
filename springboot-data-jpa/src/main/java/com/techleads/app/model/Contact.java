package com.techleads.app.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CONTACT_DTLS")
public class Contact implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/*
	 * @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CNCT_SEQ")
	 * 
	 * @SequenceGenerator(sequenceName = "CNCT_SEQ", allocationSize = 1002187, name
	 * = "CNCT_SEQ")
	 */
	@Column(name = "ID")
	@Id
	private Long id;
	@Column(name = "NAME")
	private String name;
	@Column(name = "MOBILE")
	private String contact;

}

