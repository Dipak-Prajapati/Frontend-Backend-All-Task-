package com.hb.hbPractice;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY)
@NamedQueries({ @NamedQuery(name = "fname", query = "from StudentModel where firstName =:firstName"),
		@NamedQuery(name = "lname", query = "from StudentModel where lastName =:lastName") })

public class StudentModel {

	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private int stdId;
	private String firstName;
	private String lastName;

	public StudentModel(int stdId, String firstName, String lastName) {
		super();
		this.stdId = stdId;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public StudentModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getStdId() {
		return stdId;
	}

	public void setStdId(int stdId) {
		this.stdId = stdId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "StudentModel [stdId=" + stdId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}
