package com.ustglobal.jpatestapp.onetomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table
public class PencilBox {
	@Id
	@Column
	private int bid;
	@Column
	private String bname;
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "bid", nullable = false)
	List<Pencil> pencil;

	public List<Pencil> getPencil() {
		return pencil;
	}

	public void setPencil(List<Pencil> pencil) {
		this.pencil = pencil;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public static void main(String[] args) {

	}

}
