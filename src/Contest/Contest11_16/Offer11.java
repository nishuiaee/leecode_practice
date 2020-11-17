package Contest.Contest11_16;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-16 18:59
 **/
public class Offer11 {
    public int minArray(int[] numbers) {
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int mid = left + (right - left) >> 1;

            if (numbers[mid] < numbers[right]) {
                right = mid;
            } else if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else {
                right--;
            }
        }
        return numbers[left];
    }
}
