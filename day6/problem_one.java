import java.util.Scanner;
public class problem_one {
    public static int romanToInt(String s){
        int total=0;
        int prev=0;
        for(int i=s.length()-1;i>=0;i--){
            char ch=s.charAt(i);
            int value=getValue(ch);
            if(value<prev){
                total=total-value;
            }
            else{
                total=total+value;
            }
            prev=value;
        }
        return total;
    }
    private static int getValue(char ch){
        switch(ch){
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            default: return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Roman Numerical value: ");
        String str=sc.nextLine();
        System.out.println(romanToInt(str));
    }
}
