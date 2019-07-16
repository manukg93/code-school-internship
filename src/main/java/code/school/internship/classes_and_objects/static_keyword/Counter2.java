package code.school.internship.classes_and_objects.static_keyword;

class Counter2 {
    static int count = 0;//will get memory only once and retain its value

    Counter2() {
        count++;//incrementing the value of static variable
        System.out.println(count);
    }

    public static void main(String args[]) {
//creating objects  
        Counter2 c1 = new Counter2();
        Counter2 c2 = new Counter2();
        Counter2 c3 = new Counter2();
    }
}  