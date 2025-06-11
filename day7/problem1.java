import java.util.Scanner;
class listNode{
    int val;
    listNode next;
    listNode(int x){
        val=x;
        next=null;
    }
}
public class problem1 {
    public Boolean cycle(listNode head){
        if(head==null || head.next==null){
            return false;
        }
        listNode first=head;
        listNode second=head;
        while(first!=null && first.next!=null){
            first=first.next;
            second=second.next.next;

            if(first==second){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of nodes in the list: ");
        int n=sc.nextInt();
        if(n<=0){
            System.out.println("Linked list is empty");
            return;
        }
        listNode head=null, tail=null;
        listNode[] nodes=new listNode[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the element"+(i+1)+": ");
            int value=sc.nextInt();
            listNode newNode=new listNode(value);
            nodes[i]=newNode;

            if(head==null){
                tail=newNode;
                head=newNode;
            }
            else{
                tail.next=newNode;
                tail=newNode;
            }
        }
        System.out.println("Enter position to link the last node: ");
        int pos=sc.nextInt();
        if(pos>=0 && pos<n){
            tail.next=nodes[pos];
        }
        problem1 result= new problem1();
        boolean cycle=result.cycle(head);
        System.out.println(cycle);
    }
}
