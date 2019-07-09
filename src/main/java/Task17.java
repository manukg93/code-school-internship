public class Task17 {
    public static void main(String[] args) {
        int[]array={2,6,8,9,5};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max)
            {
                max=array[i];
            }
        }

    }
}
