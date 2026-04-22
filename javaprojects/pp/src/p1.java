import java.util.Scanner;
import java.util.*;



public class p1 {

    private static int nb1;
    private static int nb2;
    private static int nb3;
    private static int nb4;

    private int sum1;
    private int sum2;


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("enter the first number:");
        nb1 = sc.nextInt();

        System.out.print("enter the second number:");
        nb2 = sc.nextInt();

        System.out.print("enter the third number:");
        nb3=sc.nextInt();

        System.out.print("enter the forth number:");
        nb4=sc.nextInt();


    }

    private void greaternb() {

        if (nb1 > nb2 && nb1 > nb3) {
            System.out.print(nb1 + "is the greater number");
        } else if (nb2 > nb1 && nb2 > nb3) {
            System.out.print(nb2 + "is the greater number");
        } else if (nb3 > nb2 && nb3 > nb1) {
            System.out.print(nb3 + "is the greater number");
        }
    }

    private void equalsumnb3(int n,int n2){
        n=sum1-nb3;

        if(n==0){
            System.out.print("the sum of"+nb1 + nb2+" is equal to "+nb3);
        }else {
            System.out.print("the sum of the first two numbers is not equal to nb3");
        }

    }

    private void equalsumnb1(int n2){
        n2=sum2-nb1;

        if(n2==0){
            System.out.print("the sum of"+nb3 + nb4+" is equal to "+nb1);
        }else{
            System.out.print("the sum of nb3 and nb 4 is not equal to nb1");
        }
    }

    private void multiplicationtb(int n1){

        for(int i=1;i<=10;i++) {
            for (int j = 1; j <= i; i++) {
                n1 = i * j;
            }

        }
    }

    private void primnumber(int n){

        boolean isprime=true;
        if (n<=1)
            isprime=false;

        else
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    isprime=false;
                    break;
                }
            }

            if(isprime){
                System.out.print(n +"is a prime number.");
            }else
                System.out.print(n + "is not a prime number.");
    }


    private void maxandmin(int[] n){

        int max;
        int min;

        for (int i=0;i<n.length;i++){
            if(n[i] > n[i+1]){
                max=n[i];
            }
            else{
                min=n[i];
            }
        }

    }

    private void reversearray(int [] n){
        int [] reverse;

        for(int i=0;i<n.length/2;i++){
            int temp=n[i];
            n[i]=n[n.length-1-i];
            n[n.length-1-i]=temp;

        }

        System.out.println("reversed array"+ Arrays.toString(n));
    }


}
