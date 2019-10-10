package com.ustglobal.jpatestapp.onttoont;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="VoterCard")
public class VoterCard {
	@Id
	@Column
	private int v_id;
	@Column
	private String v_name;
	
	@OneToOne(mappedBy="vc") 	//bidirectional
	private Person person;		//bidirectional
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
	public int getV_id() {
		return v_id;
	}
	public void setV_id(int v_id) {
		this.v_id = v_id;
	}
	public String getV_name() {
		return v_name;
	}
	public void setV_name(String v_name) {
		this.v_name = v_name;
	}
	

}
