package project;

import java.util.ArrayList;
import java.util.Scanner;

public class PartTimer extends Employee {
	
	private double basicSalary=0; 
	private double hourRate = 0;
	private int numberofHours;
	static Scanner scan = new Scanner(System.in);

	public PartTimer() {
		super();
	}

	public PartTimer(String name, int age, int yearofEmployment,double salary , double rate, int hours) {
		super(name, age, yearofEmployment);

		if (salary > 0)
			this.basicSalary = salary;
		else
			this.basicSalary = 0;
		
		if (rate > 0)
			this.hourRate = rate;
		else
			this.hourRate = 0;
		
		if (hours > 0 && hours <= 40) {
			this.numberofHours = hours;
		} else {
			System.out.println("Please enter a positive value that is less than 40");
			setNumberofHours(scan.nextInt());
		}
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public void setHourRate(double rate) {
		if (rate > 0)
			this.hourRate = rate;
		else
			this.hourRate = 0;
	}

	public void setNumberofHours(int hours) {
		if (hours > 0 && hours <= 40) {
			this.numberofHours = hours;
		} else {
			System.out.println("Please enter a positive value that is less than 40");
			setNumberofHours(scan.nextInt());
		}
	}

	public int getNumberofHours() {
		return numberofHours;
	}

	public double getHourRate() {
		return this.hourRate;
	}

	public double calculateSalary() {
		return numberofHours * hourRate;
	}

	public String toString() {
		return getName() + " is a part-timer since " + yearsOfService() + " years.\n" + "He earns $" + getHourRate()
				+ " per hour.\n" + "His total payment is $" + calculateSalary() + ".\n" + "Age: " + getAge();
	}
}
