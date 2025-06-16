import java.util.Arrays;
import java.util.Scanner;

public class problem2 {
    public static boolean isAnagram(String s, String t){
        if(s.length() != t.length())
            return false;
        
        char[] sArray= s.toCharArray();
        char[] tArray= t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);

        return (Arrays.equals(sArray, tArray));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s= sc.nextLine();
        System.out.println("Enter another string: ");
        String t=sc.nextLine();
        System.out.println(isAnagram(s,t));
    }
}
