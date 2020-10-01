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
@DiscriminatorValue("contractemployee")  
*/


/*Table per Concrete using Annotation*/
/*@Entity
@Table(name = "Contract_Employee")
@AttributeOverrides({
	@AttributeOverride(name = "id", column = @Column(name = "id")),
	@AttributeOverride(name = "name", column = @Column(name = "name"))
})*/

/*Table per SubClass using Annotation*/
@Entity
@Table(name = "Contract_Employeee")
@PrimaryKeyJoinColumn(name="id")  
public class Contract_Employee extends Employee {
	private float pay_per_hour;
	private String contract_duration;

	public Contract_Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public float getPay_per_hour() {
		return pay_per_hour;
	}

	public void setPay_per_hour(float pay_per_hour) {
		this.pay_per_hour = pay_per_hour;
	}

	public String getContract_duration() {
		return contract_duration;
	}

	public void setContract_duration(String contract_duration) {
		this.contract_duration = contract_duration;
	}

	@Override
	public String toString() {
		return "Contract_Employee [pay_per_hour=" + pay_per_hour + ", contract_duration=" + contract_duration + "]";
	}

}
