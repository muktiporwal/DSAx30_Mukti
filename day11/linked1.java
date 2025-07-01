import java.util.Scanner;

public class linked1 {
    static class ListNode{
        int val;
        ListNode next;
        ListNode(int val){
            this.val=val;
        }
    }
    static class Solution{
        public ListNode addNum(ListNode l1, ListNode l2){
            ListNode temp=new ListNode(0), tail=temp;
            int carry=0;
            while(l1!=null || l2!=null || carry !=0){
                int x=(l1!=null)?l1.val:0;
                int y=(l1!=null)?l2.val:0;
                int sum=x+y+carry;
                carry=sum/10;
                tail.next=new ListNode(sum%10);
                tail=tail.next;
                if(l1!=null)
                    l1=l1.next;
                if(l2!=null)
                    l2=l2.next;
            }
            return temp.next;
        }
    }
    private static ListNode buildList(java.util.Scanner sc){
        System.out.println("Enter the digits:");
        String line=sc.nextLine();
        ListNode temp=new ListNode(0);
        ListNode ptr=temp;
        for (int i = 0; i < line.length(); i++) {   
        char ch = line.charAt(i);
        if (ch >= '0' && ch <= '9') {          
            int digit = ch - '0';               
            ptr.next = new ListNode(digit);     
            ptr = ptr.next;
        }
    }
    return temp.next;
    }
    private static void printList(ListNode head) {
        while(head!=null){
            System.out.print(head.val);
            if(head.next!=null)
                System.out.print(" -> ");
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the linked list:");
    ListNode l1 = buildList(sc);

    System.out.println("Enter second linked list:");
    ListNode l2 = buildList(sc);

    Solution sol = new Solution();
    ListNode result = sol.addNum(l1, l2);

    System.out.println("Resultant linked list (sum in reverse order):");
    printList(result);
    
    }
}
