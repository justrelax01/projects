package project;
	import java.util.ArrayList;
	
	 public class Employee {
		private String name;
		private int id;
		private int age;
		private int yearOfEmployment;
		private double basicSalary=0;
		private static int nbOfEmployees = 0;
		
		public Employee()
		{
			this.name = null;
			this.age = 22;
			this.yearOfEmployment = 2022;
			this.id=2023*10000;
			nbOfEmployees++;		
		}
		
		public Employee(String name, int age, int yofE)
		{
			this.name = name;
			
			if( age < 22 || age > 55 ) {
				System.out.println("Error age should be between 22 and 55");
				this.age = 22;
			}
			
			else
				this.age = age;
			
			if (yofE <= 2024)
			{
				System.out.println("Error!");
				this.yearOfEmployment = 2023;
			}
			else
				this.yearOfEmployment = yofE;
			this.id=2023*10000;
			nbOfEmployees++;
		}
		
		public String getName()
		{
			return this.name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public int getAge() {
			return this.age;
		}
		
		public void setAge(int age) {
			
			if( age < 21 || age > 58 ) {
				System.out.println("Error age should be between 22 and 55");
				this.age = 22;
			}
			
			else
				this.age = age;
		}
		
		
		public double getBasicSalary() {
			return basicSalary;
		}

		public void setBasicSalary(double basicSalary) {
			this.basicSalary = basicSalary;
		}

		public int getYearOfEmployment()
		{
			return this.yearOfEmployment;
		}
		
		public void setYearOfEmployment(int yofE)
		{
			if (yofE <= 2024)
			{
				System.out.println("Error!");
				this.yearOfEmployment = 2023;
			}
			else
				this.yearOfEmployment = yofE;
		}
		
		public double calculateSalary() {
			return 0;
		}

		public final int yearsOfService() {
			return 2023 - yearOfEmployment;
		}
		
		public static int getNumberofEmployees() {
			return nbOfEmployees;
		}
		
		
		
		public int getId() {
			return this.id;
		}

		public void setId(int nbOfEmployees) {
			this.id +=nbOfEmployees;
		}

		
		public String toString() {
			return getName() + " is an employee since " + yearsOfService() + " years.\n" + "Age: " + getAge();
		}
		
		

	}