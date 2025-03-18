import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        for (int i = n / 2; i >= 1; i--) {
            System.out.print(i + " ");
        }
        for (int i = (n / 2) + 1; i <= n; i++) {
            System.out.print(i + " ");
        }
    }
}
