package ArraysContinuation_13_07_2019;

public class ArrayRemoval_8 {
        public static void main(String[] args) {
            int[] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
            int index=29;
            for(int i = 0; i < array.length; i++){
                if(array[i] == index){
                    for(int j = i; j < array.length - 1; j++){
                        array[j] = array[j+1];
                    }
                    break;
                }
            }
            for(int i = 0; i < array.length-1; i++){
                System.out.print(" " + array[i]);
            }
        }
    }
