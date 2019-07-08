package code.school.internship;

public class SecLargeAndSecSmallElements {
    public static void main(String[] args) {
        //ex. {4,5,7,8,3} -> 7is second largest element, second smallest 4
        int[] array={4,2,7,8,3};
        int max = array[0];
        int secmax=array[0];
        for(int i=0;i<array.length; i++){
            if(array[i]>max){
                secmax=max;
                max=array[i];
            }else if(array[i]>secmax){
                secmax=array[i];
            }
        }
        System.out.println("The second largest element is : " + secmax);

        int min=array[0];
        int secmin=array[0];
        for(int i=0;i<array.length;i++){
            if(array[i]<min){
                secmin=min;
                min=array[i];
            }else if(array[i]<secmax){
                secmin=array[i];
            }
        }
        System.out.println("The second largest element is : " + secmin);
    }
}
