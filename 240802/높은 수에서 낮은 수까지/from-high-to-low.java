import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = Math.max(a, b); i >= Math.min(a, b); i--) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}