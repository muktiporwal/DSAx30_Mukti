package day3;
import java.util.Scanner;
public class problem2 {
    public static int remove_element(int [] nums, int value){
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=value){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter the value: ");
        int val=sc.nextInt();
        int k=remove_element(nums,val);
        System.out.println("Number of elements not equal to "+val+": "+k);
        System.out.print("Array: ");
        for(int i=0;i<k;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
