public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        int c = 7;

        // b = a, c = b, a = c

        int temp = a;
        a = c;
        c = b;
        b = temp;
        
        System.out.println(a + "\n" + b + "\n" + c);
    }
}