import java.util.Scanner;

public class First {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.printf("a= ");
            int a = in.nextInt();
            System.out.printf("b= ");
            int b = in.nextInt();
            int c;
            c = a;
            a = b;
            b = c;
            System.out.printf("a = " + a + "\nb = " + b);
        }
}
