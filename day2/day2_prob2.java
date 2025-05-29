import java.util.Scanner;
public class day2_prob2 {
    public static void rotate(int[] arr) {
        int n = arr.length;
        int last = arr[n - 1];
        for (int i = n - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = last; 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rotate(arr);
        System.out.println("Array after rotating by one position:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}
