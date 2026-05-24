import java.util.Scanner;

public class ConstructString_1335B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int length = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < length; i++) {
                sb.append((char) ('a' + (i % b)));
            }

            System.out.println(sb.toString());
        }
    }

}
