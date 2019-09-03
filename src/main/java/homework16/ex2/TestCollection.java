package homework16.ex2;

public class TestCollection {
    public static void main(String[] args) throws CollectionIsFullException {
        Collection<String> str = new Collection<>(5);
        System.out.println(str);
        str.addEl("BMW");
        str.addEl("Merc");
        str.addEl("Suzuki");

        System.out.println(str.getIndex(0));
        System.out.println(str.isEmpty());
        System.out.println(str.contains("BMW"));
        System.out.println(str.size());

        System.out.println(str);
    }
}
