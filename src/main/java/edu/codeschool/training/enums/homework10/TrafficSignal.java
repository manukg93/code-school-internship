package edu.codeschool.training.enums.homework10;

// enum with customized value
public enum TrafficSignal {
    // this will call enum constructor with a String argument
    RED("STOP"), GREEN("GO"), YELLOW("SLOW DOWN");

    // private variable for getting values
    private String action;

    // getter
    public String getAction() {
        return this.action;
    }

    //
    private TrafficSignal(String action) {
        this.action = action;
    }

}
