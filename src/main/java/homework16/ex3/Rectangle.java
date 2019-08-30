package homework16.ex3;

public class Rectangle implements Drawable {

    @Override
    public void draw() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
