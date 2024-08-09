import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        boolean existed = true;

        for (int i = 1; i <= 5; i++) {
            int num = sc.nextInt();

            if (num % i != 0) {
                existed = false;
            }
        }

        if (!existed) {
            System.out.println(0);
        } else {
            System.out.println(1);
        }
        
        sc.close();
    }
}