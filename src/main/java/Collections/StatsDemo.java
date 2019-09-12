package Collections;

public class StatsDemo {
    public static void main(String args[]) {
        Integer inums[] = {1, 2, 3, 5 , 10};
        Stats<Integer> iOb = new Stats<Integer>(inums);
        double v = iOb.average();
        System.out.println("The average is: " + v);
        Double enums1[] = {1.3, 1.5, 1.1, 1.8};
        Stats<Double> iOb1 = new Stats<Double>(enums1);
        double w = iOb1.average();
        System.out.println("The average is: " + w);
    }
}
