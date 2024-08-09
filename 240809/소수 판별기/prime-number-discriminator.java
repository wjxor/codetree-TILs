import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        boolean existed = false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                existed = true;
            }
        }    

        if (existed) {
            System.out.println("C");
        } else {
            System.out.println("P");
        }
        
        sc.close();
    }
}