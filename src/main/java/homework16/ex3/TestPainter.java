package homework16.ex3;


public class TestPainter {
    public static void main(String[] args) {
        Painter<Square> squarePainter = new Painter<>();
        squarePainter.paint(new Square());

        Painter<Rectangle> rectanglePainter = new Painter<>();
        rectanglePainter.paint(new Rectangle());
    }
}