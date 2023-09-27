import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class merge_two_sorted_array {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 4, 5};
        int[] arr2 = {2, 4, 6, 8};
        List<Integer> mergedList = mergeSortedArrays(arr1, arr2);
        System.out.print("Merged Array: ");
        for (Integer num : mergedList) {
            System.out.print(num + " ");
        }
    }
    public static List<Integer> mergeSortedArrays(int[] arr1, int[] arr2) {
        List<Integer> mergedList = new ArrayList<>();
        int i = 0, j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mergedList.add(arr1[i]);
                i++;
            } else {
                mergedList.add(arr2[j]);
                j++;
            }
        }
        while (i < arr1.length) {
            mergedList.add(arr1[i]);
            i++;
        }
        while (j < arr2.length) {
            mergedList.add(arr2[j]);
            j++;
        }
       return mergedList;
    }
}