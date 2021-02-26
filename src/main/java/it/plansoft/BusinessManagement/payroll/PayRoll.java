package it.plansoft.BusinessManagement.payroll;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PayRoll {

	private @Id Long id;
	private Employee employee;
	private int promotions;
	private double salary;

	public PayRoll() {
	}

	public PayRoll(Long id, Employee employee, int promotions, double salary) {
		this.id = id;
		this.employee = employee;
		this.promotions = promotions;
		this.salary = salary;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public int getPromotions() {
		return promotions;
	}

	public void setPromotions(int promotions) {
		this.promotions = promotions;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
