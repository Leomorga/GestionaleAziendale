package it.plansoft.BusinessManagement.timebank;

public class TimeBank {

	private int dailyHours;
	private int actualHours;

	public TimeBank() {
	}

	public TimeBank(int dailyHours, int actualHours) {
		this.dailyHours = dailyHours;
		this.actualHours = actualHours;
	}

	public int getDailyHours() {
		return dailyHours;
	}

	public void setDailyHours(int dailyHours) {
		this.dailyHours = dailyHours;
	}

	public int getActualHours() {
		return actualHours;
	}

	public void setActualHours(int actualHours) {
		this.actualHours = actualHours;
	}

	public int getExtraHours() {
		return this.actualHours - this.dailyHours;
	}
}
