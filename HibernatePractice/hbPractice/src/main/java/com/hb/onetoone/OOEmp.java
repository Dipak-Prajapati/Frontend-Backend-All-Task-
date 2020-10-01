package com.hb.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "OOEmp")
public class OOEmp {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@PrimaryKeyJoinColumn
	private int id;
	private String name;
	
	@OneToOne(targetEntity = OOAddress.class , cascade = CascadeType.ALL)
	private OOAddress address;

	public OOEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OOEmp(int id, String name, OOAddress address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

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

	public OOAddress getAddress() {
		return address;
	}

	public void setAddress(OOAddress address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "OOEmp [id=" + id + ", name=" + name + ", address=" + address + "]";
	}

}
