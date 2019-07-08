package Day_09_07_19;

public class SlideJumpContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 1)
                continue;
            System.out.println(i + ", ");
        }
    }
}
