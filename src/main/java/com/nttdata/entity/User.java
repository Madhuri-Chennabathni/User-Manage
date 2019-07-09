package com.nttdata.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
//@Table(name="user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private float age;
	private String name;//mandatory
	private float salary;
//	private Address address;
//	public void setSalary(float salary) {
//		if(salary <= 0) {
//			throw new IllegalArgumentException("salary cannot be < 0");
//		}
//	}
//	public void setAge(float age) {
//		if(age <= 0) {
//			throw new IllegalArgumentException("Age cannot be < 0");
//		}
//	}
//	public void setName(String name) {
//		this.name=name.trim();
//		if(this.name==null ||this.name.isEmpty())
//		{
//			throw new IllegalArgumentException("Name is must");
//		}
//	}
}
