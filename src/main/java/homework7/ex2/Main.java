package homework7.ex2;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Armenia","Yerevan","Arshakunyac",0061);
        Contact contact1 = new Contact("@gmail.com","093093","12345");
        Department[] departments = new Department[2];
        departments[0]=new Department("Dep1",456);
        departments[1]=new Department("Dep2",678);
        Company company = new Company("AllState",address1,contact1,departments);
        System.out.println(company.toString());
    }
}
