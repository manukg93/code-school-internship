package edu.codeschool.training.collections.homework17;

public class TestArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(10);
        integers.add(20);
        integers.add(30);
        integers.add(40);
        integers.add(50);
        integers.add(60);
        System.out.println(integers);
        System.out.println("size: " + integers.size());
        System.out.println("element at index 3: " + integers.get(3));
        //System.out.println("element at index 7: " + integers.get(7));
        //System.out.println("element at index -1: " + integers.get(-1));
        integers.add(2, 25);
        System.out.println(integers);
        integers.add(6, 70);
        System.out.println(integers);
        integers.add(7, 80);
        System.out.println(integers);
        integers.add(90);
        System.out.println(integers);
        System.out.println(integers.indexOf(80));
        integers.remove(0);
        System.out.println(integers);
        System.out.println(integers.size());
        Object[] ints = integers.toArray();
        for (Object i : ints) {
            System.out.print(i + ",");
        }
        System.out.println();
        integers.clear();
        System.out.println(integers);
        System.out.println(integers.size());
        System.out.println(integers.isEmpty());

    }
}
