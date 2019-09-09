package edu.codeschool.training.collections.homework17;

public class TestArrayList {
    public static void main(String[] args) {

        // create ArrayList of integers
        ArrayList<Integer> integers = new ArrayList<>();

        // test add(int i, E obj)
        integers.add(0, 10);
        integers.add(0, 10);
        integers.add(2, 10);
        integers.add(3, 33);
        integers.set(1, 22);
        System.out.println("ArrayList integers: " + integers);


        // create ArrayList of doubles
        ArrayList<Double> doubles = new ArrayList<>();

        // test add(E e)
        doubles.add(11.1);
        doubles.add(12.2);
        doubles.add(13.3);
        doubles.add(14.4);
        doubles.set(0, 10.1);
        System.out.println("ArrayList doubles: " + doubles);

        // create ArrayList of numbers
        ArrayList<Number> numbers = new ArrayList<>();

        // test addAll(int i, Collection<? extends E> col)
        numbers.addAll(0, integers);
        numbers.addAll(0, integers);
        numbers.addAll(0, doubles);
        numbers.addAll(3, doubles);

        System.out.println("ArrayList numbers: " + numbers);

        // test iterator()
        ArrayListIterator<Integer> iteratorInteger = integers.iterator();
        ArrayListIterator<Double> iteratorDouble = doubles.iterator();
        ArrayListIterator<Number> iteratorNumber = numbers.iterator();

        System.out.println("iterator of integers");
        while (iteratorInteger.hasNext()) {
            System.out.print(iteratorInteger.next() + ",");
        }
        System.out.println();

        System.out.println("iterator of doubles");
        while (iteratorDouble.hasNext()) {
            System.out.print(iteratorDouble.next() + ",");
        }
        System.out.println();

        System.out.println("iterator of numbers");
        while (iteratorNumber.hasNext()) {
            System.out.print(iteratorNumber.next() + ",");
        }
        System.out.println();

        // test containsAll() method
        System.out.println("ArrayList numbers contains integers: " + numbers.containsAll(integers));
        System.out.println("ArrayList numbers contains doubles: " + numbers.containsAll(doubles));
        numbers.remove((Integer) 22);
        System.out.println("ArrayList numbers contains integers: " + numbers.containsAll(integers));



//        // test retainAll(Collection<?> var)
//        numbers.retainAll(doubles);
//        System.out.println(numbers);

//        // test removeAll(Collection<?> var)
//        numbers.removeAll(doubles);
//        System.out.println("numbers after removing doubles: " + numbers);
//        numbers.removeAll(doubles);
//        System.out.println("numbers after removing doubles: " + numbers);
    }
}
