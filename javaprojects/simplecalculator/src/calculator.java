import java.util.Scanner;

public class calculator {

    public static int add(int a, int b){
        return a+b;
    }

    public static int sub(int a, int b){
        return a-b;
    }

    public static int multiply(int a, int b){
        return a*b;
    }

    public static double div(double a, double b){
        if(a==0){
            System.out.println("cannot divide by zero");
            return 0;
        }
        return a/b;
    }




    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        boolean running=true;

        while(running) {

            System.out.println("welcome to the calculator");
            System.out.println("please choose one:");
            System.out.println("1. addition");
            System.out.println("2. subtraction");
            System.out.println("3. multipliaction");
            System.out.println("4. divition");
            System.out.println("5. exit ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("thank you for using our calculator");
            }

            System.out.println("enter a number:");
            int num = sc.nextInt();

            System.out.println("enter another number:");
            int num2 = sc.nextInt();

            double a = 0;
            switch (choice) {
                case 1:
                    a = add(num, num2);
                    break;
                case 2:
                    a = sub(num , num2);
                    break;
                case 3:
                    a = multiply(num , num2);
                    break;
                case 4:
                    a = div(num,num2);
                    break;
                default:
                    System.out.println("error wrong opperation the opp must be + - * /");
                    break;
            }

            System.out.println("result:" + a);
        }


    }

}
