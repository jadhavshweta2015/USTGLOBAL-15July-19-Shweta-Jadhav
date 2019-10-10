package com.ustglobal.jpatestapp.onttoont;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name="Person")
public class Person {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL)//unidirectional
	@JoinColumn (name="v_id")//unidirectional
	private VoterCard vc;	//unidirectional

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public VoterCard getVc() {
		return vc;
	}

	public void setVc(VoterCard vc) {
		this.vc = vc;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
