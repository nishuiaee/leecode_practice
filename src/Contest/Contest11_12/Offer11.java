package Contest.Contest11_12;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-12 15:19
 **/
public class Offer11 {
    public int minArray(int[] numbers) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            int mid = i + (j - i) >> 1;
            if (numbers[mid] > numbers[j]) {
                i = mid + 1;
            } else if (numbers[mid] < numbers[j]) {
                j = mid;
            } else {
                j--;
            }
        }
        return numbers[i];
    }

    private int solution2 (int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (numbers[i] > numbers[i + 1])
                return numbers[i + 1];
        }
        return numbers[0];
    }
}
