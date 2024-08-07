import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        int max, min;

        if (a > b) {
            max = a;
            min = b;
        } else
            max = b;
            min = a;

        for (int i = min; i <= max; i++) {
            if (i % 5 == 0) {
                sum += i;
            }
        }


        System.out.println(sum);


        sc.close();
    }


}