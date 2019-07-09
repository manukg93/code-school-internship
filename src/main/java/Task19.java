public class Task19 {
    public static void main(String[] args) {
        int[]array={1,2,3};
        int[]array1={1,2,3};
        if(array.length==array1.length)
        {
            for (int i = 0; i <array.length ; i++) {
                if(array[i]==array1[i])
                {
                    System.out.println("The arrays are equal");

                }
            }
        }
        else
            System.out.println("The arrays arent equal");
    }
}
