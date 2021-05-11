import java.util.Scanner;

/**
 * Created by JiaLe on 2021/5/11 19:58
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int t = scanner.nextInt();
            while (t > 0) {
                int n = scanner.nextInt();
                int k = scanner.nextInt();
                int[] card = new int[2 * n];
                for (int i = 0; i < 2 * n; i++) {
                    card[i] = scanner.nextInt();
                }
                int[] ans = shuffle(card,k);
                for (int i = 0; i < ans.length; i++) {
                    if (i != ans.length - 1) {
                        System.out.print(ans[i] + " ");
                    } else {
                        System.out.println(ans[i]);
                    }
                }
                t--;
            }
        }
        scanner.close();
    }
    public static int[] shuffle(int[] card, int k) {
        int[] ret = new int[card.length];
        while (k >0) {
            int cardr = card.length - 1;
            int cardl = card.length / 2 - 1;
            for (int i = card.length - 1; i >= 0; i -= 2) {
                ret[i] = card[cardr];
                ret[i - 1] = card[cardl];
                cardr--;
                cardl--;
            }
            for (int i = 0; i < card.length; i++) {
                card[i] = ret[i];
            }
            k--;
        }
        return ret;
    }
}
