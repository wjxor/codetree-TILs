import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }


        sc.close();
    }


}