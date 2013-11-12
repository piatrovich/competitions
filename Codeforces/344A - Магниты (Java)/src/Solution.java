import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        String tmp = scanner.nextLine();
        int island = 0;
        String curr, pre_curr;
        pre_curr = scanner.nextLine();
        for (int i = 1; i < num; ++i) {
            curr = scanner.nextLine();
            if (!pre_curr.equalsIgnoreCase(curr))
                island += 1;
            pre_curr = curr;
        }
        System.out.print(island + 1);
    }

}
