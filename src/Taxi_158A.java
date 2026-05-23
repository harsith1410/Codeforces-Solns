import java.util.Scanner;

public class Taxi_158A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = {0,0,0,0};
        int grps = n;
        int taxi = 0;

        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            arr[x-1] += 1;
        }

        while (grps > 0) {

            if(arr[3]!=0){
                taxi+=arr[3];
                grps-=arr[3];
                arr[3] = 0;
            }
            else if(arr[2]!=0){
                taxi++;
                grps--;
                arr[2]--;
                if(arr[0]!=0){
                    grps--;
                    arr[0]--;
                }
            }
            else if (arr[1]!=0) {
                taxi++;
                grps--;
                arr[1]--;
                if(arr[1]!=0){
                    grps--;
                    arr[1]--;
                }
                else if (arr[0]!=0){
                    if(arr[0]>=2){
                        grps-=2;
                        arr[0]-=2;
                    }
                    else{
                        grps--;
                        arr[0]--;
                    }
                }
            }
            else{
                if(arr[0]==0){
                    break;
                }
                else{
                    while(arr[0]>0){
                        taxi++;
                        arr[0]-=4;
                        grps-=4;
                    }
                }
            }

        }

        System.out.println(taxi);

    }

}
