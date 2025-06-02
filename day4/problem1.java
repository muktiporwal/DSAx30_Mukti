package day4;
import java.util.Scanner;
public class problem1 {
    public static boolean isSum(int[] nums, int k){
        return func(nums,0,k);
    }
    static boolean func(int[] nums, int index, int k){
        if(k==0)
            return true;
        if(index==nums.length)
            return false;
        if(func(nums, index+1, k-nums[index])){
            return true;
        }
        if(func(nums,index+1,k)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the value of k: ");
        int k=sc.nextInt();
        if(isSum(nums, k)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        sc.close();
    }
}
