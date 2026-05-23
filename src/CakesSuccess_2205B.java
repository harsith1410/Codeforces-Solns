import java.util.Scanner;

public class CakesSuccess_2205B {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int test = sc.nextInt();

        for (int t=0; t<test; t++) {
            long n = sc.nextLong();
            long k = 1;

            for (long i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    k *= i;

                    while (n % i == 0) {
                        n /= i;
                    }
                }
            }

            if (n > 1) {
                k *= n;
            }

            System.out.println(k);
        }

        sc.close();
    }
}