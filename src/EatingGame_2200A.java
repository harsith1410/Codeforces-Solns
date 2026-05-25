import java.util.Scanner;

public class EatingGame_2200A {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {

            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; j++) {
                arr[j] = sc.nextInt();
            }
            int[] arr2 = new int[n];
            for (int j = 0; j < n; j++) {

                int[] temp = arr.clone();
                int completed = 0;
                int player = j+1;
                while (completed < n) {
                    if(temp[player-1]>0){
                        temp[player-1]--;
                        if(temp[player-1]==0 && completed+1==n){
                            completed++;
                            arr2[player-1]=1;
                        } else if (temp[player-1]==0) {
                            completed++;
                        }
                    }
                    player=(player%n)+1;
                }
            }
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if(arr2[j]!=0){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }
    }

}
