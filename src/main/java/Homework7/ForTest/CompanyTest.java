package Homework7.ForTest;

import Homework7.Adress;
import Homework7.Company;
import Homework7.Contact;
import Homework7.Department;

public class CompanyTest {
    public static void main(String[] args) {
        Company a = new Company();
        Adress b = new Adress("Armenia", "Yerevan");
        Adress c = new Adress("Armenia", "Yerevan");
        Department d = new Department("Marketing department", 65);
        Department e = new Department("Commercial department", 65);
        Contact f = new Contact("manezak94@gmail.com", 65, 10);
        Contact g = new Contact("manezak94@gmail.com", 65, 10);
        System.out.println(b.equals(c));
        System.out.println(d.equals(e));
        System.out.println(f.equals(g));
    }
}
