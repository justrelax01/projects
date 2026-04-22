import java.util.Scanner;
import java.util.*;

public class car {

    Scanner sc=new Scanner(System.in);
    private String brand;
    private String color;
    private int speed=0;

    public car(String brand,String color,int speed){
        this.brand=brand;
        this.color=color;
        this.speed=speed;
    }
    public int getSpeed(){
        return this.speed;
    }
    public String getBrand(){
        return this.brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getColor(){
        return this.color;
    }

    public void accelerate(){
        int increse=0;
        speed+=increse;
        System.out.print(brand +"accelerated to "+ speed+"km/h");
    }

    public void brake(){
        int decrease=0;
        speed-=decrease;
        if(speed<=0)
            speed=0;
        else {
            System.out.println(brand+"slowed down to "+speed+"km/h");
        }

    }

    public void gear() {
        int choice = 0;
        String type = null;

//        if (type != "P" || type != "R" || type != "N" || type != "D"){
//            System.out.println("the type must be P,R,N,D");
//
//        }
//
//        if(type == "P"){
//            speed =0;
//        }else{
//            System.out.print("the gear is on R or N or D");
//        }

        
        switch (choice){
            case 'P':
                System.out.println("car is on park");
                break;
            case 'R':
                System.out.println("car is r");
                break;
            case 'N':
                System.out.println("");
                break;
            case 'D':
                System.out.println("the car is on drive");
                break;
            default:
                System.out.println("error...");
                break;
        }
    }

    public void nbofseats(){
        int nbofs = 0;
        do {
            if (nbofs == 5) {
                System.out.print("this car type is a sidan");
            } else
                if (nbofs == 7)
                    System.out.println("");

            else if(nbofs >7 && nbofs <=15)
                    System.out.println("this car type is a van");
//            else if (nbofs >15 && nbofs <=45)
//                    System.out.println("this car type is a bus");

            else{
                    System.out.println("it is not a car");
                }
        }while(nbofs<=15);
    }

    @Override
    public String toString() {
        return "car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", speed=" + speed +
                '}';
    }



    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        car car1=new car("","",70);

        car1.toString();

        System.out.println("enter the accelerate:");
        int speedacc=sc.nextInt();
        car1.accelerate();

        System.out.println("enter the gear type:");
        String type = sc.nextLine();
        car1.gear();

        System.out.println("enter the brake:");
        int speedbra=sc.nextInt();
        car1.brake();

    }

}