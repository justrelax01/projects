package project;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	
	String fName, lName, id;
	int age, YOF, salary, countFT=0, countPT=0, countEmp=0, countcus=0,foundIndex=0;
	Employee emp=new Employee("John",25,2025);
	Order ord=new Order(20);
	Custumer[] cus=new Custumer[1000];
	FullTimer[] f1 = new FullTimer[1000];
	PartTimer[] p1 = new PartTimer[1000];
	Employee[] e1 = new Employee[1000];
	Scanner scan=new Scanner(System.in);
	
	
	System.out.println("Welcome to my Company!");
	 System.out.println("What is your role: are you an Owner or a Custumer?\n" +
	            "1-Owner\n" +
	            "2-Custumer\n");
	    System.out.println("Enter your choice:");
	    int choiceRole = scan.nextInt();
	    
	switch(choiceRole) {
	case 1: 
		System.out.println("Username: ");
		 String username = scan.next();
         System.out.print("Password: ");
         String password = scan.next();
         if (username.equals("BAY.mybusiness") && password.equals("0000")) {
             System.out.println("Welcome to your company, sir!\nWhat do you like to do");
          
		System.out.println(
				"1-Add Employee"
				+"\n2-Remove Employee"
				+"\n3-Search for an Employee using ID"
				);
		
		int choiceOwner=scan.nextInt();
		switch(choiceOwner) {
		case 1: 
			System.out.println(
					  "1-Full timer Employee"
					+ "Part Timer Employee");
			int job=scan.nextInt();
			switch(job) {
			case 1:
			 System.out.println("Enter Employee's first name:");
             fName = scan.next();
             do {
                 System.out.print("Enter your age:");
                 age = scan.nextInt();
             } while (age < 22 || age > 55);

             System.out.println("Enter Employee's year of employment:");
             YOF = scan.nextInt();
		     System.out.println("Enter Employee's basic salary");
		     salary=scan.nextInt();
		     System.out.println("Enter The Transportation payment");
		     double Tpay=scan.nextDouble();
             f1[countFT]=new FullTimer(fName,age,YOF,salary,Tpay);
             e1[countEmp]=new Employee(fName,age,YOF);
             countFT++;
             countEmp++;
             break;
			case 2:
				System.out.println("Enter Employee's first name:");
	             fName = scan.next();
	             do {
	                 System.out.print("Enter your age:");
	                 age = scan.nextInt();
	             } while (age < 22 || age > 55);

	             System.out.println("Enter Employee's year of employment:");
	             YOF = scan.nextInt();
			     System.out.println("Enter Employee's basic salary");
			     salary=scan.nextInt();
			     System.out.println("Enter The rate");
			     double rate=scan.nextDouble();
			     System.out.println("Enter Employee's number of hours");
			     int hours=scan.nextInt();
			     p1[countPT]=new PartTimer(fName,age,YOF,salary,rate,hours);
			     e1[countEmp]=new Employee(fName,age,YOF);
			     countPT++;
			     countEmp++;
			     break;
		}
		case 2:
			System.out.println(
					  "1-Full timer Employee"
					+ "Part Timer Employee");
			int rmv=scan.nextInt();
			switch(rmv) {
			case 1:
				System.out.print("Enter Employee's first name: ");

			String	fname = scan.nextLine();

				boolean found = false;

				for(int i=0; i<countFT; i++) {

				if(f1[i].
				getName().toLowerCase().equals(fname.toLowerCase()))

				{

					foundIndex = i;

					found = true;

					}

					}

					if(found)

					{

					for(int i=foundIndex; i<(countPT-1); i++)

					{


					f1[i] = f1[i+1];

					}

					countFT--;

					System.out.println("Employee deleted!");

					}

					else

					System.out.println("Employee " + fname

					+  " not found!");

					System.out.println();

					break;
			case 2:
				System.out.print("Enter Employee's first name: ");

				String	fnamee = scan.nextLine();

					boolean foundd = false;

					for(int i=0; i<countPT; i++) {

					if(p1[i].
					getName().toLowerCase().equals(fnamee.toLowerCase()))

					{

						foundIndex = i;

						foundd = true;

						}

						}

						if(foundd)

						{

						for(int i=foundIndex; i<(countPT-1); i++)

						{


						p1[i] = p1[i+1];

						}

						countPT--;

						System.out.println("Employee deleted!");

						}

						else

						System.out.println("Employee " + fnamee

						+  " not found!");
						break;
			}
		case 3:
			System.out.println("Enter Employee's ID");
			int Id=scan.nextInt();
			if(Id==emp.getId()) {
				emp.toString();
			}
			else 
				System.out.println("Employee not found");
			break;
		}
         }
	case 2:
		System.out.println("Welcome to my company");
		System.out.println("Please enter the required information");
		System.out.println("Enter your first name: ");
		String firstn=scan.nextLine();
		System.out.println("Enter your last name: ");
		String lastn=scan.nextLine();
		System.out.println("Enter your email: ");
		String mail=scan.nextLine();
		System.out.println("Enter your location: ");
		String locationn=scan.nextLine();
		System.out.println("Enter your order: ");
		Order ord1=new Order(scan.nextInt());
		cus[countcus]=new Custumer(firstn,lastn,mail,locationn,ord1);
		countcus++;
		cus.toString();
		break;
}
}
}