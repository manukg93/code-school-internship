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
        integers.add(60);
        integers.add(60);
        integers.add(60);
        integers.add(60);
        integers.remove((Integer)60);
        integers.remove((Integer)30);
        integers.remove((Integer)60);
        integers.remove((Integer)50);
        integers.remove((Integer)100);
        System.out.println(integers);
        integers.add(4, 45);
        integers.add(5, 55);
        integers.add(6, 65);
        System.out.println(integers);
        integers.remove(0);
        integers.remove(2);
        integers.remove(4);
        System.out.println(integers);

        ArrayList<Integer> integers1 = new ArrayList<>(integers.size());
        integers1.add(20);
        integers1.add(40);
        integers1.add(45);
        integers1.add(55);
        integers1.add(60);
        System.out.println(integers1);
        System.out.println(integers.equals(integers1));

    }
}
