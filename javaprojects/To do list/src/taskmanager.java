import java.util.ArrayList;
import java.util.*;
public class taskmanager {

    ArrayList<String> task=new ArrayList<>();
    private int size=0;


    public void addtask(String newtask){
        task.add(newtask);
        System.out.println("Task added successfully.");
    }

    public void viewalltasks(){

        if(task.isEmpty())
            return;

        System.out.print("---- All Tasks ----");
        for(int i=0;i<task.size();i++){
            System.out.println("Task:"+ (i+1)+":");
            System.out.println(task.get(i));
        }

    }

    public void removetask(int n){

        if(n==0)
            return ;

        task.remove(n-1);
        System.out.println("Task is removed !");

    }


    public void updatetask(int n){

        if (task.isEmpty())
            return;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter new task description: ");
        String updatedTask = sc.nextLine();

        task.set(n - 1, updatedTask);

        System.out.println("Task updated successfully.");
    }


}
