public class Task7 {
    public static void main(String[] args) {
            int[]array={1,25,8,6,4,5,56,55,8,68,45,62,66,82,63,33,3,7,71,32};
            int a = 1;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==a)
            {
                System.out.println("Array contains the value");
                break;
            }
            if(i==array.length-1)
            {
                System.out.println("Array doesnt contains the value");
            }

        }


    }
}
