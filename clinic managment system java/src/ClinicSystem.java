import java.util.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ClinicSystem {

    private static List<Doctor> doctors = new ArrayList<>();
    private static List<Patient> patients = new ArrayList<>();
    private static List<Appointment> appointments = new ArrayList<>();
    private static List<Employee> employees= new ArrayList<>();
    private static Queue<Patient> waitingList = new LinkedList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            displayMenu();
            choice = getValidatedChoice(scanner);

            switch (choice) {
                case 1:
                    addDoctor(scanner);//O(1)
                    break;
                case 2:
                    addPatient(scanner);//O(1)
                    break;
                case 3:
                    addEmployee(scanner);//O(1)
                    break;
                case 4:
                    reserveAppointment(scanner);//O(n)
                    break;
                case 5:
                    viewDoctors();//O(n)
                    break;
                case 6:
                    viewPatients();//O(n)
                    break;
                case 7:
                    veiwEmployees();//O(n)
                    break;
                case 8:
                    editDoctorTimes(scanner);
                    break;
                case 9:
                    changeAppointment(scanner);
                    break;
                case 10:
                    deleteAppointment(scanner);
                    break;
                case 11:
                    deleteEmployee(scanner);
                    break;
                case 12:
                    viewAppointments();
                    break;
                case 13:
                    manageWaitingList(scanner);
                    break;
                case 14:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 14);
        scanner.close();
    }
    private static void displayMenu() {

        System.out.print("\033[H\033[2J");
        System.out.flush();

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String formattedDateTime = now.format(formatter);

        System.out.println("+-------------------------------------------+");
        System.out.println("|            Clinic System Menu             |");
        System.out.println("+-------------------------------------------+");
        System.out.println("| Date and Time: " + formattedDateTime + " |");
        System.out.println("+-------------------------------------------+");

        System.out.printf("| %-3s | %-30s |\n", "No", "Option");
        System.out.println("+-----+--------------------------------+");
        System.out.printf("| %-3s | %-30s |\n", "1", "Add Doctor");
        System.out.printf("| %-3s | %-30s |\n", "2", "Add Patient");
        System.out.printf("| %-3s | %-30s |\n", "3", "Add Employee");
        System.out.printf("| %-3s | %-30s |\n", "4", "Reserve Appointment");
        System.out.printf("| %-3s | %-30s |\n", "5", "View Doctors");
        System.out.printf("| %-3s | %-30s |\n", "6", "View Patients");
        System.out.printf("| %-3s | %-30s |\n", "7", "View Employees");
        System.out.printf("| %-3s | %-30s |\n", "8", "Edit Doctor Times");
        System.out.printf("| %-3s | %-30s |\n", "9", "Change Appointment");
        System.out.printf("| %-3s | %-30s |\n", "10", "Delete Appointment");
        System.out.printf("| %-3s | %-30s |\n", "11", "Delete Employee");
        System.out.printf("| %-3s | %-30s |\n", "12", "View Appointments");
        System.out.printf("| %-3s | %-30s |\n", "13", "Manage Waiting List");
        System.out.printf("| %-3s | %-30s |\n", "14", "Exit");
        System.out.println("+-----+--------------------------------+");

        System.out.print("\nEnter your choice: ");
    }

    private static int getValidatedChoice(Scanner scanner) {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number between 1 and 14.");
            scanner.next();
        }
        int choice = scanner.nextInt();
        scanner.nextLine();
        return choice;
    }


    //1
    private static void addDoctor(Scanner scanner) {
        String id;
        do {
            System.out.print("Enter Doctor ID (non-empty, alphanumeric, no spaces): ");
            id = scanner.nextLine();
        } while (!id.matches("^[a-zA-Z0-9]+$"));

        String name;
        do {
            System.out.print("Enter Doctor Name (letters and spaces only): ");
            name = scanner.nextLine();
        } while (!name.matches("[a-zA-Z ]+"));

        String specialization;
        do {
            System.out.print("Enter Specialization (non-empty): ");
            specialization = scanner.nextLine();
        } while (specialization.isEmpty());

        int yearOfBirth;
        int currentYear = LocalDateTime.now().getYear();
        do {
            System.out.print("Enter the year of birth (between 1900 and " + currentYear + "): ");
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid year.");
                scanner.next();
            }
            yearOfBirth = scanner.nextInt();
            scanner.nextLine();
        } while (yearOfBirth < 1900 || yearOfBirth > currentYear);

        String sex;
        do {
            System.out.print("Enter your sex (M/F): ");
            sex = scanner.nextLine().toUpperCase();
        } while (!sex.equals("M") && !sex.equals("F"));

        String bloodType;
        do {
            System.out.print("Enter your blood type (e.g., A+, B-, O+): ");
            bloodType = scanner.nextLine().toUpperCase();
        } while (!bloodType.matches("^(A|B|AB|O)[+-]$"));

        doctors.add(new Doctor(id, name, yearOfBirth, bloodType, specialization, sex));
        System.out.println("Doctor added successfully.");
    }


    //2
    private static void addPatient(Scanner sc) {

        String id;
        do {
            System.out.print("Enter Patient ID (non-empty, alphanumeric, no spaces): ");
            id = sc.next();
        } while (!id.matches("^[a-zA-Z0-9]+$"));


        String name;
        do {
            System.out.print("Enter Patient Name (letters and spaces only): ");
            name = sc.next() + sc.nextLine();
        } while (!name.matches("[a-zA-Z ]+"));

        int yearofbirth;
        int currentYear = LocalDateTime.now().getYear();
        do {
            System.out.print("Enter your year of birth (between 1900 and " + currentYear + "): ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid year.");
                sc.next();
            }
            yearofbirth = sc.nextInt();
            sc.nextLine();
        } while (yearofbirth < 1900 || yearofbirth > currentYear);

        int age;
        do {
            System.out.print("Enter Patient Age (0-120): ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid age.");
                sc.next();
            }
            age = sc.nextInt();
            sc.nextLine();
        } while (age < 0 || age > 120);

        String phonenb;
        do {
            System.out.print("Enter your phone number (10 digits): ");
            phonenb = sc.next();

        } while (!phonenb.matches("\\d{10}"));

        String bloodtype;
        do {
            System.out.print("Enter your blood type (e.g., A+, B-, O+): ");
            bloodtype = sc.next().toUpperCase();
        } while (!bloodtype.matches("^(A|B|AB|O)[+-]$"));


        String sex;
        do {
            System.out.print("Enter your sex (M/F): ");
            sex = sc.next().toUpperCase();
        } while (!sex.equals("M") && !sex.equals("F"));

        String medicalrecords;
        do {
            System.out.print("Enter medical records (non-empty): ");
            medicalrecords = sc.next() + sc.nextLine();
        } while (medicalrecords.isEmpty());

        String address;
        do {
            System.out.print("Enter your address (non-empty): ");
            address = sc.next() + sc.nextLine();
        } while (address.isEmpty());

        patients.add(new Patient(id, name, age, yearofbirth, phonenb, address, sex, medicalrecords, bloodtype));

        System.out.println("Patient added successfully.");
    }


    //3
    private static void addEmployee(Scanner sc) {

        String id;
        do {
            System.out.print("Enter your ID (non-empty, alphanumeric, no spaces): ");
            id = sc.nextLine();
        } while (!id.matches("^[a-zA-Z0-9]+$"));


        String name;
        do {
            System.out.print("Enter your name (letters and spaces only): ");
            name = sc.nextLine();
        } while (!name.matches("[a-zA-Z ]+"));


        int age;
        do {
            System.out.print("Enter your age (between 18 and 120): ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid age.");
                sc.next();
            }
            age = sc.nextInt();
            sc.nextLine();
        } while (age < 18 || age > 120);

        int yearofbirth;
        int currentYear = LocalDateTime.now().getYear();
        do {
            System.out.print("Enter your year of birth (between 1900 and " + currentYear + "): ");
            while (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid year.");
                sc.next();
            }
            yearofbirth = sc.nextInt();
            sc.nextLine();
        } while (yearofbirth < 1900 || yearofbirth > currentYear);

        String address;
        do {
            System.out.print("Enter your address (non-empty): ");
            address = sc.nextLine();
        } while (address.isEmpty());

        String bloodtype;
        do {
            System.out.print("Enter your blood type (e.g., A+, B-, O+): ");
            bloodtype = sc.nextLine().toUpperCase();
        } while (!bloodtype.matches("^(A|B|AB|O)[+-]$"));

        String sex;
        do {
            System.out.print("Enter your sex (M/F): ");
            sex = sc.nextLine().toUpperCase();
        } while (!sex.equals("M") && !sex.equals("F"));

        employees.add(new Employee(id, name, age, yearofbirth, address, bloodtype, sex));
        System.out.println("Employee added successfully.");
    }


    //4
    private static void reserveAppointment(Scanner sc) {

        String patientId;
        Patient patient = null;
        do {
            System.out.print("Enter Patient ID (or type 'back' to return to the main menu): ");
            patientId = sc.next();
            if (patientId.equalsIgnoreCase("back")) {
                System.out.println("Going back to the main menu...");
                return;
            }
            patient = findPatientById(patientId);
            if (patient == null) {
                System.out.println("Patient not found. Please try again.");
            }
        } while (patient == null);

        String doctorId;
        Doctor doctor = null;
        do {
            System.out.print("Enter Doctor ID (or type 'back' to return to the main menu): ");
            doctorId = sc.next();
            if (doctorId.equalsIgnoreCase("back")) {
                System.out.println("Going back to the main menu...");
                return;
            }
            doctor = findDoctorById(doctorId);
            if (doctor == null) {
                System.out.println("Doctor not found. Please try again.");
            }
        } while (doctor == null);

        String time;
        boolean validTime = false;
        do {
            System.out.print("Enter Appointment Time (or type 'back' to return to the main menu): ");
            time = sc.next();
            if (time.equalsIgnoreCase("back")) {
                System.out.println("Going back to the main menu...");
                return;
            }

            if (doctor.getAvailableTimes().contains(time)) {
                validTime = true;
            } else {
                System.out.println("Time slot not available. Please select another time.");
            }
        } while (!validTime);

        appointments.add(new Appointment(patient, doctor, time));
        doctor.getAvailableTimes().remove(time);
        System.out.println("Appointment reserved successfully.");
    }


    //5
    private static void editDoctorTimes(Scanner scanner) {
        System.out.print("Enter Doctor ID: ");
        String doctorId = scanner.next();
        Doctor doctor = findDoctorById(doctorId);

        if (doctor == null) {
            System.out.println("Doctor not found.");
            return;
        }

        System.out.println("Current Available Times: " + doctor.getAvailableTimes());
        System.out.print("Enter new time slot to add: ");

        String newTime = scanner.next();
        doctor.addAvailableTime(newTime);
        System.out.println("Time slot added successfully.");
    }

    //6
    private static void changeAppointment(Scanner scanner) {

        System.out.print("Enter Patient ID: ");
        String patientId = scanner.next();//O(1)

        Appointment appointment = findAppointmentByPatientId(patientId);//O(n)

        if (appointment == null) {
            System.out.println("Appointment not found.");
            return;
        }

        System.out.print("Enter new time: ");
        String newTime = scanner.next();//O(1)
        Doctor doctor = appointment.getDoctor();

        if (doctor.getAvailableTimes().contains(newTime)) {//O(m)
            appointment.getDoctor().getAvailableTimes().add(appointment.getTime());//O(1)
            appointment = new Appointment(appointment.getPatient(), doctor, newTime);//O(1)
            doctor.getAvailableTimes().remove(newTime);//O(m)
            System.out.println("Appointment rescheduled successfully.");
        }

        else {
            System.out.println("Time slot not available.");
        }
    }

    //7
    private static void deleteAppointment(Scanner scanner) {
        System.out.print("Enter Patient ID: ");
        String patientId = scanner.next();
        Appointment appointment = findAppointmentByPatientId(patientId);

        if (appointment == null) {
            System.out.println("Appointment not found.");
            return;
        }

        appointments.remove(appointment);
        appointment.getDoctor().getAvailableTimes().add(appointment.getTime());
        System.out.println("Appointment deleted successfully.");
    }

    //8
    private static void deleteEmployee(Scanner sc){
        System.out.print("enter employee ID: ");
        String employeeId = sc.next();//O(1)
        Employee employee = findEmployeeById(employeeId);

        if(employee == null){
            System.out.print("Employee not found !!");
            return ;

        }

        employees.remove(employee);//O(n)
        System.out.print("employee deleted successfully .");

    }

    //9
    private static void viewDoctors() {
        System.out.println("\nList of Doctors:");
        for (Doctor doctor : doctors) {
            System.out.println(doctor);
        }
    }

    //10
    private static void viewPatients() {//O(n)
        System.out.println("\nList of Patients:");
        for (Patient patient : patients) {
            System.out.println(patient);
        }
    }

    //11
    private static void veiwEmployees(){//O(n)
        System.out.print ("\n list of employees: ");
        for (Employee employee : employees){
            System.out.print(employee);
        }

    }

    //12
    private static void viewAppointments() {
        System.out.println("\nList of Appointments:");
        for (Appointment appointment : appointments) {
            System.out.println(appointment);
        }
    }

    //13
    private static void manageWaitingList(Scanner scanner) {
        System.out.println("\nCurrent Waiting List:");
        for (Patient patient : waitingList) {
            System.out.println(patient);
        }

        System.out.print("Do you want to remove the first patient from the waiting list? (yes/no): ");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("yes") && !waitingList.isEmpty()) {
            Patient removedPatient = waitingList.poll();
            System.out.println("Removed: " + removedPatient);
        }
    }

    //14
    //to serach for id
    private static Patient findPatientById(String id) {//O(n)
        for (Patient patient : patients) {//O(1)
            if (patient.getId().equals(id)) {
                return patient;
            }
        }
        return null;//O(n)
    }

    //15
    //to serach for id
    private static Doctor findDoctorById(String id) {
        for (Doctor doctor : doctors) {
            if (doctor.getId().equals(id)) {
                return doctor;
            }
        }
        return null;
    }

    //16
    //to serach for id
    private static Employee findEmployeeById(String id){
        for(Employee employee : employees){
            if(employee.getId().equals(id)) {
                return employee;
            }
        }
        return null;
    }

    //17
    //to serach for id
    private static Appointment findAppointmentByPatientId(String patientId) {
        for (Appointment appointment : appointments) {
            if (appointment.getPatient().getId().equals(patientId)) {
                return appointment;
            }
        }
        return null;
    }
}
