package homework17.ex4;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("everyone");
        list.add("my");
        list.add("name");
        list.add("is");
        list.add("Mark");
        list.add("nice");
        list.add("to");
        list.add("meet");
        list.add("you");

        Iterator<String> iter = list.iterator();
        while (iter.hasNext()){
            System.out.println(iter.next());
        }
        list.remove(2);
        for(String object:list){
            System.out.println(object);
        }

    }
}
