import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int counter=0;
        int num = rand.nextInt(100) + 1;
        int n = 0;
        System.out.println("guess the number");
        while (n >= 1 || n <= 100) {

            System.out.println("enter a number between 1 and 100:");
            n = sc.nextInt();

            if(n<1 || n>100){
                System.out.println("the number must be greater than 1 and less than 100 !!");
            }

            if(n>=60 && num<n-10){
                System.out.println("guess is too high ");
            }else
                if(n<=40 && num>n+10){
                System.out.println("guess is too low");
            }

            if(n==num){
                System.out.print("the random number between 1 and 100 is:" + num +"\n");
                System.out.println("congrats your a winner !!");
            }else{

                counter++;

            }
            System.out.println("your tries to find the random number is:"+counter);
        }
    }
}