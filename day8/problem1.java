import java.util.Scanner;

public class problem1 {
    public static int maxArea(int[] arr){
        int bottom=0;
        int top=arr.length-1;
        int maxarea=0;
        while(bottom<top){
            int width=top-bottom;
            int minHeight;
            if(arr[bottom]<arr[top]){
                minHeight=arr[bottom];
            }
            else{
                minHeight=arr[top];
            }
            int currentArea=width*minHeight;
            if(currentArea>maxarea){
                maxarea=currentArea;
            }
            if(arr[bottom]<arr[top]){
                bottom++;
            }
            else{
                top--;
            }
        }
        return maxarea;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length: ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxArea(arr));
    }
}
