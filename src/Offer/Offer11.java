package Offer;

/**
 * @description: 11.旋转数组的最小数字
 * @author: Yuner
 * @create: 2020-10-10 14:32
 **/
public class Offer11 {
    public int minArray(int[] numbers) {
        int len = numbers.length;
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int mid = left + (right - left) /2;

            if (numbers[mid] > numbers[right]) {
                left = mid + 1;
            } else if (numbers[mid] < numbers[right]) {
                right = mid;
            } else {
                right--;
            }
        }
        return numbers[left];
    }
}
