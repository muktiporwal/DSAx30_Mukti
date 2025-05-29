import java.util.Scanner;
public class day2_1{
    public static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int size=sc.nextInt();
        int[] nums= new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("Enter the target sum: ");
        int target=sc.nextInt();
        int[] result=twoSum(nums, target);
        if(result!=null){
            System.out.println("Indices of are: "+result[0]+" and "+result[1]);
        }
        else{
            System.out.println("No two elements found with the given target.");
        }
        sc.close();
    }
}