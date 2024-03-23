
// Sorted elements

import java.util.Arrays;

public class KthMinMax {
    public static void main(String[] args) {
        int[] arr={6,2,3,4,1,9};
        int k=3;
        Arrays.sort(arr);
        System.out.println(arr[k-1]);
    }
}
