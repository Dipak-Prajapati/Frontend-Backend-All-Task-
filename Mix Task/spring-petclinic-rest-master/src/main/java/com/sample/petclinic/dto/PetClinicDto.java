package com.sample.petclinic.dto;

import java.util.List;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotEmpty;

import com.samples.petclinic.model.Pet;
import com.samples.petclinic.model.Visit;

public class PetClinicDto {

    @NotEmpty
    private String firstName;

    @NotEmpty
    private String lastName;
	
    @NotEmpty
    private String address;

    @NotEmpty
    private String city;

    @NotEmpty
    @Digits(fraction = 0, integer = 10)
    private String telephone;
    
    private List<Pet> pets;
    
    private List<Visit> visits;

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<Pet> getPets() {
		return pets;
	}

	public void setPets(List<Pet> pets) {
		this.pets = pets;
	}

	public List<Visit> getVisits() {
		return visits;
	}

	public void setVisits(List<Visit> visits) {
		this.visits = visits;
	}

	@Override
	public String toString() {
		return "PetClinicDto [firstName=" + firstName + ", lastName=" + lastName + ", address=" + address + ", city="
				+ city + ", telephone=" + telephone + ", pets=" + pets + ", visits=" + visits + "]";
	}

	
}
