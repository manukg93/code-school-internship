package homework20;

public class TestCounter {

    public static void main(String[] args) throws  InterruptedException{
        Counter obj=new Counter();

        Counter.CustomCounter  ch1=new Counter.CustomCounter(obj);
        Counter.CustomCounter ch2=new Counter.CustomCounter(obj);
        Thread th1=new Thread(ch1,"first");
        Thread th2=new Thread(ch2,"second");
         th1.start();

         th2.start();







    }
}
