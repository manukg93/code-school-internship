package homework19;

public class SelectionSort {
    public void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int index = i;

            for (int k = i + 1; k < arr.length; k++) {
                if (arr[k] < arr[index]) {
                    index = k;
                }
            }
            int min = arr[index];
            arr[index] = arr[i];
            arr[i] = min;
        }
    }

    void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {

            System.out.print(arr[i] + " , ");
        }

    }
}