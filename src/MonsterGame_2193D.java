import java.util.Arrays;
import java.util.Scanner;

public class MonsterGame_2193D {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();

        for (int t = 0; t < test; t++) {
            int difficulty = sc.nextInt();
            long[] swords = new long[difficulty];
            long[] strikes = new long[difficulty];


            for (int i = 0; i < difficulty; i++) {
                swords[i] = sc.nextLong();
            }
            for (int i = 0; i < difficulty; i++) {
                long temp = sc.nextLong();
                if(i!=0){
                    strikes[i] = temp + strikes[i-1];
                }
                else {
                    strikes[i] = temp;
                }
            }
            Arrays.sort(swords);

            long score = 0;
            for (int i = 0; i < difficulty; i++) {
                long curr_diff = swords[i];
                int available_swords = difficulty-i;

                int low = 0, high = difficulty - 1, levels = 0;
                while (low <= high) {
                    int mid = low + (high - low) / 2;
                    if (strikes[mid] <= available_swords) {
                        levels = mid + 1; // We can beat at least 'mid + 1' levels
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                }

                score = Math.max(score, (long) curr_diff * levels);


            }
            System.out.println(score);
        }

    }

}
