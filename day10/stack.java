import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class stack {
    Queue<Integer> q1;
    Queue<Integer> q2;
    public stack(){
        q1=new LinkedList<>();
        q2=new LinkedList<>();
    }
    public void push(int x){
        q2.add(x);
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<Integer> temp=q1;
        q1=q2;
        q2=temp;
    }
    public int pop(){
        return q1.remove();
    }
    public int top(){
        return q1.peek();
    }
    public boolean empty(){
        return q1.isEmpty();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        stack myStack=new stack();
        while(true){
            System.out.println("MENU");
            System.out.println("1.PUSH");
            System.out.println("2.POP");
            System.out.println("3.PEEK");
            System.out.println("4.CHECK IF EMPTY");
            System.out.println("5.EXIT");
            System.out.println("Enter your choice:");
            int choice=sc.nextInt();

            switch (choice) {
            case 1:
                System.out.println("Enter element to push");
                int x=sc.nextInt();
                myStack.push(x);
                break;
            case 2:
                System.out.println(myStack.pop());
                break;
            case 3:
                System.out.println(myStack.top());
                break;
            case 4:
                System.out.println(myStack.empty());
                break;
            case 5:
                System.out.println("EXITING");
                sc.close();
                return;
            default:
                System.out.println("Invalid choice.");
                break;
            }
        }
    }
}

