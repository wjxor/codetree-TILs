import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || Include369(i)) {
                System.out.print(0 + " ");
            } else
                System.out.print(i + " ");
        }


        sc.close();
    }

    public static boolean Include369(int num) {
        boolean result = false;

        while (num != 0) {
            int digit = num % 10;
            if (digit == 3 || digit == 6 || digit == 9) {
                result = true;
                break;
            }
            num /= 10;
        }
        return result;
    }


}