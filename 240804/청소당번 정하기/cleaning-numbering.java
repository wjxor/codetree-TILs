import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();

        // 교실(2):Cr, 복도(3):Hall, 화장실(12):Rr
        int CrCnt = 0, HallCnt = 0, RrCnt = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 12 == 0)
                RrCnt++;
            else if (i % 3 == 0) 
                HallCnt++;
            else if (i % 2 == 0)
                CrCnt++;
            
        }


        System.out.println(CrCnt + " " + HallCnt + " " + RrCnt);


        sc.close();
    }


}