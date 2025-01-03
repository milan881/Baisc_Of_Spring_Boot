package com.location.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 * Entity class representing the Location table in the database.
 * This class is used for ORM (Object-Relational Mapping) with JPA.
 */
@Entity
@Table(name = "Location")// Maps this entity to the "Location" table in the database
public class Locations {

	@Id // Marks this field as the primary key for the entity
	private long id;
	private String name;
	@Column(name = "code")// Maps this field to the "code" column in the database
	private String codes;
	private String type;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCodes() {
		return codes;
	}
	public void setCodes(String codes) {
		this.codes = codes;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	} 
}