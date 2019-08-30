package homework16.ex3;

public class Square implements Drawable {

    @Override
    public void draw() {

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}
