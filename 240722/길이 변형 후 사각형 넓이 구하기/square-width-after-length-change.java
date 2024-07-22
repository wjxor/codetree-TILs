import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int w = sc.nextInt();
        int h = sc.nextInt();

        int total = (w + 8) * (h * 3);

        System.out.println(w + 8);
        System.out.println(h * 3);
        System.out.println(total);

        sc.close();
    }
}