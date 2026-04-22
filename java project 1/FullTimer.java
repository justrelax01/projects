package project;

import java.util.ArrayList;

public class FullTimer extends Employee {
	
	private double basicSalary = 0;
	private double transportAllowance = 0;
	
	public FullTimer() {
		super();
	}

	public FullTimer(String name, int age, int yearofEmployment, double salary, double transport) {
		super(name, age, yearofEmployment);
		
		if (salary > 0)
			this.basicSalary = salary;
		else
			this.basicSalary = 0;
		
		if (transport > 0)
			this.transportAllowance = transport;
		else
			this.transportAllowance = 0;
		
	}

	public void setSalary(double salary) {
		if (salary > 0)
			this.basicSalary = salary;
		else
			this.basicSalary = 0;
	}

	public void setTransportAllowance(double transport) {
		if (transport > 0)
			this.transportAllowance = transport;
		else
			this.transportAllowance = 0;
	}

	public double getSalary() {
		return this.basicSalary;
	}

	public double getTransportAllowance() {
		return this.transportAllowance;
	}

	public double calculateSalary() {
		return basicSalary + transportAllowance;
	}
	 
	   public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
    
	public String toString() {
		return getName() + " is a full-timer since " + yearsOfService() + " years.\n" + "He earns " + calculateSalary()
				+ " $.\n" + "Age: " + getAge();
	}
}

