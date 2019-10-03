package homework20;


public class CustomMultiThread implements Runnable {

   int[] array;
    long sum = 0;
    int start;
    int end;

    public CustomMultiThread(int[] array, int start, int end) {
        this.array = array;
        this.start =start;
        this.end = end;
    }

    public long getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
        System.out.println(Thread.currentThread().getName());
    }
}





