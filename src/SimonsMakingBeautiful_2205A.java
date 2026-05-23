import java.util.Scanner;

public class SimonsMakingBeautiful_2205A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int testCases = sc.nextInt();

        while (testCases-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];

            int firstUgly = -1;
            int lastUgly = -1;
            int maxSoFar = 0;

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                maxSoFar = Math.max(maxSoFar, arr[i]);

                // An index is "ugly" if the current max equals the index (1-based)
                if (maxSoFar == i + 1) {
                    if (firstUgly == -1) {
                        firstUgly = i;
                    }
                    lastUgly = i;
                }
            }

            // Based on the sample output, we swap the first and last ugly indices
            // This breaks the "ugly" chain in the middle of the array.
            if (firstUgly != -1 && lastUgly != -1) {
                int temp = arr[firstUgly];
                arr[firstUgly] = arr[lastUgly];
                arr[lastUgly] = temp;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + (i == n - 1 ? "" : " "));
            }
            System.out.println();
        }
    }
}