package enums;

public enum Character {
    A("name", 15),
    B("name2", 25);


    final String customName;
    final int age;

    Character(String customName, int age) {
        this.customName = customName;
        this.age = age;
    }


    void getCodePoint() {
        System.out.println(0);
    }

    public String getCustomName() {
        return customName;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        System.out.println(Character.A.name() + " ==== " + Character.A.getCustomName());
        System.out.println(Character.B.name() + " ==== " + Character.B.getCustomName());
    }
}
