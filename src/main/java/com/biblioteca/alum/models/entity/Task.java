package com.biblioteca.alum.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "tasks")
public class Task implements Serializable {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	
	@Column(nullable=false)
	private String label;
	
	@Column(nullable=false)
	private Boolean completa;
	
	

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;



	public String getLabel() {
		return label;
	}



	public void setLabel(String label) {
		this.label = label;
	}



	public Boolean getCompleta() {
		return completa;
	}



	public void setCompleta(Boolean completa) {
		this.completa = completa;
	}



	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}
 
}