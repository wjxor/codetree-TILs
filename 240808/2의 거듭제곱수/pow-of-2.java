import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        int x = 0;
        
        // 2^x >= n을 찾을 때까지 x 증가
        while (Math.pow(2, x) < n) {
            x++;
        }
        
        System.out.println(x);
        
        scanner.close();
    }
}