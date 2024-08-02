import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;
        // a에서 시작해서 조건에 따라 커지다가 b보다 커지는 순간에 종료
        // 홀수->2배
        // 짝수->+3

        System.out.print(a + " ");
        for (int i = a; i <= b;) {
            if (i % 2 == 0)
                i += 3;
            else
                i *= 2;
            
            if (i <= b)
                System.out.print(i + " ");
        }

        sc.close();
    }
}