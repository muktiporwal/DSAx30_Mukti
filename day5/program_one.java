
import java.util.Scanner;
public class program_one {
    public int myAtoi(String s){
        int i=0,n=s.length();
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        int sign=1;
        if(i<n){
            if(s.charAt(i)=='-'){
                sign=-1;
                i++;
            }
            else if(s.charAt(i)=='+'){
                i++;
            }
        }
        long result=0;
        int MAX=2147483647;
        int MIN=-2147483648;

        while(i<n && Character.isDigit(s.charAt(i))){
            int digit=(s.charAt(i)-'0');
            if(result>(MAX-digit)/10){
                return (sign==1)?MAX:MIN;
            }
            result=result*10+digit;
            i++;
        }
        return (int) (result*sign);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        program_one sol= new program_one();
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        System.out.println(sol.myAtoi(str));
    }
}
