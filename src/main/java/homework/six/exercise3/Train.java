package homework.six.exercise3;

public class Train extends Transport {

    public Train() {

    }

    public Train(String color, double maxSpeed) {
        super(color, maxSpeed);
    }

    @Override
    public void start() {
        System.out.println("Start!");
    }

    @Override
    public void stop() {
        System.out.println("Stop!");
    }

    @Override
    public void move(double distance) {
        System.out.println("The train was moved"+distance+"miles");
    }
}
