import java.util.*;

public class problem2 {
    public List<List<String>> partition(String s){
        List<List<String>> res=new ArrayList<>();
        tracking(s,0,new ArrayList<>(),res);
        return res;
    }
    private void tracking(String s, int begin, List<String> temp, List<List<String>> res){
        if(begin==s.length()){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i=begin+1;i<=s.length();i++){
            String sub=s.substring(begin,i);
            if(isPalindrome(sub)){
                temp.add(sub);
                tracking(s, i, temp, res);
                temp.remove(temp.size()-1);
            }
        }
    }
    private boolean isPalindrome(String str){
        int left=0,right=str.length()-1;
        while(left<right){
            if(str.charAt(left++)!= str.charAt(right--))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        problem2 part=new problem2();
        System.out.println("Enter the string: ");
        String input=sc.nextLine();
        List<List<String>> partitions=part.partition(input);
        for(List<String> parts:partitions){
            System.out.println(parts);
        }
    }
}
