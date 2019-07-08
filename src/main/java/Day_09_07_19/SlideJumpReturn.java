package Day_09_07_19;

public class SlideJumpReturn {
    public static void main(String[] args) {
        boolean i = true;
        System.out.println("Before the return.");
        if (i)
            return;
        System.out.println("This won't execute.");
    }
}
