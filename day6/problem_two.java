import java.util.Scanner;

public class problem_two {
    public static String addBin(String a, String b){
        StringBuilder ans= new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry =0;
        while(i>=0 || j>=0 || carry!=0){
            int binA=(i>=0)?a.charAt(i)-'0':0;
            int binB=(j>=0)? b.charAt(j)-'0':0;
            int sum=binA+binB+carry;
            ans.append(sum%2);
            carry=sum/2;
            i--;
            j--;
        } 
        return ans.reverse().toString();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first binary numbers to add: ");
        String a=sc.nextLine();
        System.out.println("Enter another binary number to add: ");
        String b=sc.nextLine();
        String sum=addBin(a, b);
        System.out.println("Sum of binary string: "+sum);
    }
}
