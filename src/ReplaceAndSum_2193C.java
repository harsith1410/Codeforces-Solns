import java.util.Scanner;

public class ReplaceAndSum_2193C {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            int q = sc.nextInt();
            int[] arrA = new int[n];
            for (int j = 0; j < n; j++) {
                arrA[j] = sc.nextInt();
            }
            int[] arrB = new int[n];
            for (int j = 0; j < n; j++) {
                arrB[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                arrA[j] = Math.max(arrA[j], arrB[j]);
            }
            for (int j = n-2; j >= 0; j--) {
                arrA[j] = Math.max(arrA[j], arrA[j+1]);
            }
            int[] prefixSum = new int[n+1];
            for (int j = 0; j < n; j++) {
                prefixSum[j+1] = prefixSum[j] + arrA[j];
            }
            for (int queries = 0; queries < q; queries++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int sum = 0;

                System.out.print(prefixSum[r]-prefixSum[l-1]+" ");
            }
            System.out.println();
        }
    }

}
