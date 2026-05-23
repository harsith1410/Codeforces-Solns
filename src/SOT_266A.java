import java.util.Scanner;

public class SOT_266A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String s = sc.next();
        StringBuilder sb = new StringBuilder(s);

        int i = 0;
        int cnt = 0;

        while (i<sb.length()-1){
            if(sb.charAt(i) == sb.charAt(i+1)){
                sb.deleteCharAt(i);
                cnt++;
            }
            else{
                i++;
            }
        }

        System.out.println(cnt);
    }

}
