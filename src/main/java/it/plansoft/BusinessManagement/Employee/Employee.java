package it.plansoft.BusinessManagement.Employee;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	private @Id Long id;
	private String name;
	private String lastName;
	private String position;
	private TimeBank timeBank;
	private PayRoll payRoll;

	public Employee() {
	}

	public Employee(Long id, String name, String lastName, String position, TimeBank timeBank, PayRoll payRoll) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.position = position;
		this.timeBank = timeBank;
		this.payRoll = payRoll;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public TimeBank getTimeBank() {
		return timeBank;
	}

	public void setTimeBank(TimeBank timeBank) {
		this.timeBank = timeBank;
	}

	public PayRoll getPayRoll() {
		return payRoll;
	}

	public void setPayRoll(PayRoll payRoll) {
		this.payRoll = payRoll;
	}

}