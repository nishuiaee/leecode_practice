package Offer;

/**
 * @description:
 * @author: Yuner
 * @create: 2020-11-02 10:32
 **/
public class Offer40 {

    private void heapify (int[] arr, int i, int n) {
        if (i >= n) {
            return;
        }
        int min = i;
        int c1 = 2 * i + 1;
        int c2 = 2 * i + 2;
        if (c1 < n && arr[c1] < arr[min]) min = c1;
        if (c2 < n && arr[c2] < arr[min]) min = c2;
        if (min != i) {
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
            heapify(arr, min, n);
        }
    }
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] res = new int[k];
        int count = 0;
        int len = arr.length;
        int last_node = len - 1;
        int parent = (last_node - 1) / 2;
        for (int i = parent; i >= 0; i--) {
            heapify(arr, i, len);
        }
        for (int n = len - 1; n >= len - k; n--) {
            res[count] = arr[0];
            arr[0] = arr[n];
            arr[n] = res[count++];
            heapify(arr, 0, n);
        }
        return res;
    }
}
