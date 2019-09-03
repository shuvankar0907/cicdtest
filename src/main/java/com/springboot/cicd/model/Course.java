package com.springboot.cicd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

@Entity
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue(generator = "sequence_generator")
	@SequenceGenerator(name = "sequence_generator", sequenceName = "sequence_generatore", initialValue = 1000)
	private long id;
	@Column(columnDefinition="name")
	private String name;
	@Version
    private int version;
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
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	
	
}
