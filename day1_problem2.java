import java.util.Scanner;
public class day1_problem2 {
    public static void pattern(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print((char)('A'+ j ));
            }
            for(int j=i-2;j>=0;j--){
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        pattern(n);
    }
}
