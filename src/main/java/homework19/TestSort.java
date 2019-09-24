package homework19;

public class TestSort {
    public static void main(String[] args) {
        SelectionSort ob=new SelectionSort();
        int arr[] = {1, 4, 3, 8, 1, 32, 0, 7,1,6};
        for(int i:arr){
            System.out.print(i+" , ");
        }
      ob.selectionSort(arr);
        System.out.println();
        ob.printArray(arr);
        }




    }
