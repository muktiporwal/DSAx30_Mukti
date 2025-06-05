import java.util.Scanner;
public class program_two {
    public static String merge(String a, String b){
        int overLap=0;
        int lenA=a.length();
        int lenB=b.length();
        int minLen=lenA<lenB? lenA:lenB;
        for(int i=minLen;i>0;i--){
            boolean ans=true;
            for(int j=0;j<i;j++){
                if(a.charAt(lenA-i+j)!=b.charAt(j)){
                    ans=false;
                    break;
                }
            }
            if(ans){
                overLap=i;
                break;
            }
        }
        return (a+b.substring(overLap));
    }
    public static boolean isGood(String s1,String s2){
        if(s1.length()<s2.length())
            return true;
        if(s1.length()>s2.length())
            return false;
        return s1.compareTo(s2)<0;
    }
    public static String findShortestString(String a, String b, String c){
        String[][] permutation={{a,b,c},{a,c,b},{b,a,c},{b,c,a},{c,a,b},{c,b,a}};
        String best=null;
        for(int i=0;i<6;i++){
            String[] order=permutation[i];
            String merged=(merge(merge(order[0], order[1]),order[2]));
            if(best==null || isGood(merged, best)){
                best=merged;
            }
        }
        return best;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first string ");
        String str1=sc.nextLine();
        System.out.println("Enter the second string ");
        String str2=sc.nextLine();
        System.out.println("Enter the third string ");
        String str3=sc.nextLine();
        System.out.println(findShortestString(str1, str2, str3));
    }
}
