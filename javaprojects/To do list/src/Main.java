import java.util.ArrayList;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        taskmanager t=new taskmanager() ;

        Scanner sc =new Scanner(System.in);

        boolean running =true;
        int choice =0;

        while(running){

            System.out.println("-- welcome to our program --");
            System.out.println("-- manage your daily tasks --");
            System.out.println("1. Add a task");
            System.out.println("2. view all tasks");
            System.out.println("3. remove a task");
            System.out.println("4. update a task");
            System.out.println("5. exit");
            System.out.println("please enter your choice:");
            choice =sc.nextInt();

            if(choice == 5){
                System.out.println("thank you for using our program .");
                break;
            }


            switch(choice){
                case 1:
                    System.out.print("Enter task: ");
                    String newTask = sc.nextLine();
                    t.addtask(newTask);
                    break;
                case 2:
                    t.viewalltasks();
                    break;
                case 3:
                    System.out.print("Enter task number to remove: ");
                    int removeIndex = sc.nextInt();
                    sc.nextLine();
                    t.removetask(removeIndex);
                    break;
                case 4:
                    System.out.print("Enter task number to update: ");
                    int updateIndex = sc.nextInt();
                    sc.nextLine();
                    t.updatetask(updateIndex);
                    break;
                case 5:
                    System.out.println("Thank you for using our program.");
                    running = false;
                    break;
                default:
                    System.out.println("error !!");
                    break;
            }
        }
    }
}