import java.util.Scanner;

public class StringTask_118A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().toLowerCase();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ("aeiouy".contains(String.valueOf(c))) {
                continue;
            }
            else{
                sb.append('.');
                sb.append(c);
            }
        }
        System.out.println(sb.toString());

    }

}
