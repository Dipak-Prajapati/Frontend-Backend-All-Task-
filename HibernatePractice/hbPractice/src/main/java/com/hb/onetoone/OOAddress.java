package com.hb.onetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "OOAddress")
public class OOAddress {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String address;
	
	@OneToOne(targetEntity = OOEmp.class)
	private OOEmp emp;

	@Override
	public String toString() {
		return "OOAddress [id=" + id + ", address=" + address + ", emp=" + emp + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public OOEmp getEmp() {
		return emp;
	}

	public void setEmp(OOEmp emp) {
		this.emp = emp;
	}

	public OOAddress(int id, String address, OOEmp emp) {
		super();
		this.id = id;
		this.address = address;
		this.emp = emp;
	}

	public OOAddress() {
		super();
		// TODO Auto-generated constructor stub
	}

}
