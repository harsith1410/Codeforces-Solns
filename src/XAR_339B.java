import java.util.Scanner;

public class XAR_339B {

    // Xenia and Ringroad

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[m];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        long time = 0;
        int house = 1;

        for (int i = 0; i < m; i++) {
            if (arr[i] >= house) {
                time += (arr[i] - house);
            } else {
                time += (n - house + arr[i]);
            }
            house = arr[i];
        }

        System.out.println(time);
    }

}
