package day3;
import java.util.Scanner;
public class problem1 {
    public static int target_index(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=target){
                return i;
            }
        }
        return arr.length;
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target number: ");
        int target=sc.nextInt();
        int index=target_index(arr,target);
        System.out.println("Target index: "+index);
        sc.close();
    }
}
