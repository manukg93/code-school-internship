package inner_nested_classes;

public class CustomString {

    public static void main(String[] args) {
        String str1 = "str1";
        String str3 = "str1A";
        str1 = str1.concat("A");
        str1 = str1.intern();
        System.out.println(str1);
        System.out.println(str3);
        //System.out.println(str1);

        System.out.println(str1 == str3);
    }
}
