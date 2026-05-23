import java.util.Scanner;

public class ChatRoom_58A {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        
        int idx = 0;
        boolean found = false;
        
        // h->1 e->2 l->3,4 o->5
        
        while (idx < input.length()-4) {
            if (input.charAt(idx) == 'h'){
                if (idx!=0 && input.charAt(idx-1) == 'h'){
                    idx++;
                    continue;
                }
                int search = 2;
                int j_idx = idx + 1;
                while (j_idx < input.length()) {
                    if (input.charAt(j_idx) == 'e' && search==2) {
                        search++;
                    }
                    else if (input.charAt(j_idx) == 'l' && (search==3 || search==4)) {
                        search++;
                    }
                    else if (input.charAt(j_idx)=='o' && search==5) {
                        found = true;
                        break;
                    }
                    j_idx++;
                }
                if (found) {
                    System.out.println("YES");
                    break;
                }
                idx++;
            }
            else{
                idx++;
            }
        }

        if (!found) {
            System.out.println("NO");
        }

    }

}
