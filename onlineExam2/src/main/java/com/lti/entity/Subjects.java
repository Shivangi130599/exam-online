package com.lti.entity;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_subjects")
public class Subjects {
	@Id
	@GeneratedValue
	@Column(name = "subject_id")
	private int id;
	
	private String subName;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "subjects" )
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}
}
