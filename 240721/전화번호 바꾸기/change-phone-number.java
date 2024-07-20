import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        sc.useDelimiter("-");

        String f = sc.next();
        int m = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%s-%d-%d", f, b, m);
        
               
    }
}