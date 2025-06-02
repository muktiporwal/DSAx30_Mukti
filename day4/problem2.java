package day4;
import java.util.*;
public class problem2 {
    public List<List<Integer>> subSet(int[] nums){
        List<List<Integer>> ans=new ArrayList<>();
        ans.add(new ArrayList<>());

        for(int num:nums){
            int size=ans.size();
            for(int i=0;i<size;i++){
                List<Integer> subset=new ArrayList<>(ans.get(i));
                subset.add(num);
                ans.add(subset);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        problem2 generator=new problem2();
        System.out.println("Enter the size of array: ");
        int size= sc.nextInt();
        int[] nums=new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        List<List<Integer>> subset=generator.subSet(nums);
        System.out.println(subset);
    }
}
