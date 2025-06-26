import java.util.Scanner;

public class problem2 {
    public int countStudent(int[] students, int[] sandwiches){
        int wantC=0;
        int wantS=0;
        for(int pref:students){
            if(pref==0)
                wantC++;
            else
                wantS++;
        }
        for(int i=0;i<sandwiches.length;i++){
            if(sandwiches[i]==0){
                if(wantC==0){
                    return wantS;
                }
                wantC--;
            }
            else{
                if(wantS==0){
                    return wantC;
                }
                wantS--;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n=sc.nextInt();
        int[] students=new int[n];
        int[] sandwiches=new int[n];

        System.out.println("Enter values for students:");
        for(int i=0;i<n;i++){
            students[i]=sc.nextInt();
        }
        System.out.println("Enter the values for sandwiches:");
        for(int i=0;i<n;i++){
            sandwiches[i]=sc.nextInt();
        }

        problem2 sol=new problem2();
        int count=sol.countStudent(students, sandwiches);
        System.out.println(count);
        sc.close();
    }
}
