package homework20;

public class Counter {
    private int counter = 0;
    int sum;


    synchronized public void increment() {
        for (int i = 0; i <= 10; i++) {
            sum=counter+i;

        }
        System.out.println(Thread.currentThread().getName()+"  "+sum);

    }
    static class CustomCounter extends Thread{
        Counter counter;

        CustomCounter(Counter counter){
            this.counter=counter;
        }

        @Override
        public void run() {
            counter.increment();
        }
    }

}




