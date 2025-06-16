package day1;
import java.util.Scanner;

public class day1_problem4 {
    public static int sum_squares(int n){
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum=sum+digit*digit;
            n=n/10;
        }
        return sum;
    }
    public static boolean isHappy(int n){
        int a=n;
        int b=n;
        do { 
            a=sum_squares(a);
            b=sum_squares(sum_squares(b));
        } while (a!=b);
        while(b!=1 && a!=b){
            a=sum_squares(a);
            b=sum_squares(b);
        }
        return a==1;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number to check if it is happy: ");
        int n=sc.nextInt();
        if(isHappy(n)){
            System.out.println(n+" is a Happy number");
        }
        else{
            System.out.println(n+" is not a Happy number.");
        }
    }
}
