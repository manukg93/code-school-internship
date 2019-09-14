package edu.codeschool.training.collections.homework17.client;

import edu.codeschool.training.collections.homework17.array_list.ArrayList;

import java.util.Iterator;
import java.util.List;

public class TestArrayList {
    public static void main(String[] args) {

        List<Double> doubles = new ArrayList<>();
        doubles.add(12.2);
        doubles.add(14.2);
        doubles.add(17.2);
        doubles.add(19.2);
        doubles.add(23.2);

        Iterator<Double> iterator = doubles.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }
        System.out.println();

        doubles.add(4, 10.2);
        System.out.println(doubles);

        List<Integer> integers = new ArrayList<>();
        integers.add(4);
        integers.add(5);
        integers.add(6);
        integers.add(7);
        integers.add(8);
        System.out.println(integers);
        List<Number> numbers = new ArrayList<>();
        numbers.addAll(doubles);
        numbers.addAll(0, integers);
        System.out.println(numbers);
    }
}
