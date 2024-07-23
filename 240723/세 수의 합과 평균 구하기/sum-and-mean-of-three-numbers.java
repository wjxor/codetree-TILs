import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt() + sc.nextInt() + sc.nextInt();

        System.out.printf("%d \n%d", sum, (sum / 3));

        sc.close();
    }
}