package homework20;

public class TestThreadSum {

    public static void main(String[] args) throws InterruptedException {
        int []array=new int[1000000];
        for(int i=0; i<array.length; i++){
            array[i]=i;
        }
        Thread t=Thread.currentThread();
        t.setName("My Thread");
        CustomMultiThread run1=new CustomMultiThread(array,0,array.length/2);
        CustomMultiThread run2=new CustomMultiThread(array,array.length/2,array.length);
        Thread th1=new Thread(run1,"First");
        Thread th2=new Thread(run2,"Second");
        th1.start();
        th2.start();
        th1.join();
        th2.join();
        System.out.println(th1.isAlive());
        System.out.println(th2.isAlive());
        System.out.println(run1.getSum()+run2.getSum());
        System.out.println(Thread.currentThread().getName());

    }
}
