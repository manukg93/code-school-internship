package homework19;

public class InsertionSort {
    public static void Insertion(int[]arr){

        for(int i=1; i<arr.length; i++){
            int key=arr[i];
            int j=i-1;
            while((j>-1)&&(arr[j]>key)){
            arr[j+1]=arr[j];
            j--;
            }
            arr[j+1]=key;
        }
    }

    public static void main(String[] args) {
        int arr[]={1, 7, 4, 2, 97, 53, 2 ,1, 0};
        for(int j:arr){
            System.out.print(j+"  ");
        }
        Insertion(arr);
        System.out.println();
        for(int j:arr){
            System.out.print(j+" ");
        }
    }
}
