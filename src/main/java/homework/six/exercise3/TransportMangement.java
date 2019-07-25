package homework.six.exercise3;

public class TransportMangement {
    public static void main(String[] args) {
        Train train = new Train("Blue",200);
        train.move(200);
        Bus bus = new Bus("Red",100);
        bus.stop();
    }
}
