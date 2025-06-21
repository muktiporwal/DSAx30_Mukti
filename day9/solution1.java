import java.util.Scanner;
import java.util.Stack;

public class solution1 {
    public static boolean isValid(String s){
        Stack<Character> stack= new Stack<>();

        for(char ch: s.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                stack.push(ch);
            }
            else if(ch==')' && (stack.isEmpty() || stack.pop() !='(' )){
                return false;
            } 
            else if(ch=='}' && (stack.isEmpty() || stack.pop() !='{' )){
                return false;
            } 
            else if(ch==']' && (stack.isEmpty() || stack.pop() !='[' )){
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s=sc.nextLine();
        System.out.println(isValid(s));
    }
}
