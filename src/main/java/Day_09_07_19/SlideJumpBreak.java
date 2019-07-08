package Day_09_07_19;

public class SlideJumpBreak {
    public static void main(String[] args) {
       for (long i = 100; i > 15; i--) {
         if (i == 25)
             break;
           System.out.println("i: " + i);
        }
       System.out.println("Loop complete.");
    }
}
