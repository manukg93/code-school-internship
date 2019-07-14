package ArraysContinuation_13_07_2019;

public class ArraySpecificValue_22 {
    public static void main(String[] args) {
        long [] array = {1, 20, 14, 609, 8};
        long num = 609;
        for(int i=0;i<array.length;i++){
            if(array[i] == num){
                System.out.println(num);
                break;
            }
        }
    }
}

