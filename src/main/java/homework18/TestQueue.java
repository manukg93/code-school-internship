package homework18;


public class TestQueue {
    public static void main(String[] args) {
        QueueDemo<String>q=new QueueDemo<>();

        q.add("A");
        q.add("B");
        q.add("C");
        q.add("C");
        q.add("D");
        q.offer("T");
        q.offer("P");
        q.offer("O");

        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println(q.element());
        System.out.println(q.peek());

    }
}
