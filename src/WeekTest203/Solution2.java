package WeekTest203;

import java.util.Arrays;
import java.util.Collections;

public class Solution2 {
    public int maxCoins(int[] piles) {
        int[] newPiles = new int[piles.length];
        Arrays.sort(piles);
        int sum = 0;
        for (int i = 0; i < piles.length / 3; i++) {
            sum += piles[piles.length - 2 - (2 * i)];
        }
        return sum;
    }
}
