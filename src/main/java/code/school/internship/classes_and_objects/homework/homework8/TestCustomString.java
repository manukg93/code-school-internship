package code.school.internship.classes_and_objects.homework.homework8;


public class TestCustomString {
    public static void main(String[] args) {

        CustomString string2 = new CustomString(new char[]{'o', 'p', 'e', 'r', 'a', 't', 'o', 'r'});
        System.out.println("Last index of \'r\' in string2: " + string2.lastIndexOf('r'));
        System.out.println("String2: " + string2);

        System.out.println(string2.indexOf(new CustomString(new char[] {'p','e','r','h'})));

        CustomString str1 = new CustomString(new char[]{'t','o','r'});
        System.out.println(string2.contains(str1));
        System.out.println("String2 starts with \"ope\": " + string2.startsWith("ope"));
        System.out.println("String2 ends with \"or\": " + string2.endsWith("or"));
        System.out.println(string2.lastIndexOf('r'));

        CustomString reverse = string2.reverse();
        System.out.println(reverse);


        CharSequence subSequence = string2.subSequence(0, 5);
        System.out.println(subSequence);

    }
}
