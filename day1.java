import java.util.Scanner;
class day1{
    public static void print(int n){
        int size=2*n-1;
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                int top=i;
                int bottom=size-1-i;
                int left=j;
                int right=size-1-j;

                int min=top;
                if(left<min){
                    min=left;
                }
                if(bottom<min){
                    min=bottom;
                }
                if(right<min){
                    min=right;
                }
                System.out.print((n-min)+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        print(num);
    }
}