package edu.codeschool.training.enums.homework10;

public class EnumConstructorExample {
    public static void main(String[] args) {
        TrafficSignal[] signals = TrafficSignal.values();

        for (TrafficSignal signal : signals) {
            System.out.println("name: " + signal.name() +
                    " action: " + signal.getAction());

        }
    }
}
