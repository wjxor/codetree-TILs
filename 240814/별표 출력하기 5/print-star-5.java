import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // 입력받은 n값

        for (int i = n; i >= 1; i--) {  // n부터 1까지 반복
            for (int j = 0; j < i; j++) {
                for (int k = 0; k < i; k++) {
                    System.out.print("*");  // 별 출력
                }
                if (j < i - 1) {
                    System.out.print(" ");  // 각 패턴 사이의 공백 출력
                }
            }
            System.out.println();  // 줄 바꿈
        }

        sc.close();
    }
}