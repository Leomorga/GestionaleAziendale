package it.plansoft.BusinessManagement.payroll;

public class PayRoll {

	private double salary;
	private int promotions;

	public PayRoll() {
	}

	public PayRoll(double salary, int promotions) {
		this.salary = salary;
		this.promotions = promotions;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getPromotions() {
		return promotions;
	}

	public void setPromotions(int promotions) {
		this.promotions = promotions;
	}

}
