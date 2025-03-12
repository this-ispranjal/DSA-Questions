
import java.util.*;

public class StringCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = "pranjal";

        // hashing
        int[] hash = new int[26];
        for (int i = 0; i < s.length(); i++) {
            hash[s.charAt(i) - 'a']++;
        }

        // this is for n no. of checkssss
        int q;
        q = sc.nextInt();
        while (q-- > 0) {
            char c;
            c = sc.next().charAt(0);
            // fetch:
            System.out.println(hash[c - 'a']);
        }
        // System.out.println(hash['j' - 'a']);
    }
}
