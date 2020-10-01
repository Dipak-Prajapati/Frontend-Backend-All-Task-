package com.hb.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/*Table per Hierarchy using Annotation*/
/*@Entity  
@DiscriminatorValue("regularemployee")  
*/

/*Table per Concrete using Annotation*/
/*@Entity
@Table(name = "Regular_Employee")
@AttributeOverrides({
	@AttributeOverride(name = "id", column = @Column(name = "id")),
	@AttributeOverride(name = "name", column = @Column(name = "name"))
})*/

/*Table per SubClass using Annotation*/
@Entity
@Table(name = "Regular_Employeee")
@PrimaryKeyJoinColumn(name="id")
public class Regular_Employee extends Employee {
	private float salary;
	private int bonus;

	public Regular_Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	@Override
	public String toString() {
		return "Regular_Employee [salary=" + salary + ", bonus=" + bonus + "]";
	}

}
