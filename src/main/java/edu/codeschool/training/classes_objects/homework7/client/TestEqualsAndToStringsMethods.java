package edu.codeschool.training.classes_objects.homework7.client;

import edu.codeschool.training.classes_objects.homework7.equals_and_toString.Address;
import edu.codeschool.training.classes_objects.homework7.equals_and_toString.Company;
import edu.codeschool.training.classes_objects.homework7.equals_and_toString.Contact;
import edu.codeschool.training.classes_objects.homework7.equals_and_toString.Department;

public class TestEqualsAndToStringsMethods {
    public static void main(String[] args) {
        Address address1 = new Address("Armenia", "Yerevan", "Arshakunyats ave", 0007);
        Contact contact1 = new Contact("synopsis@gmail.com", "010 12 12 12", "099 12 12 12");

        Address address2 = new Address("Armenia", "Yerevan", "aaa", 0007);
        System.out.println(address1.equals(address2));
        System.out.println(address1);
        System.out.println(address2);

        Department department1 = new Department("Department A", 10);
        Department department2 = new Department("Department B", 12);

        Company company1 = new Company("Synopsis", address1, 2);
        Department[] departments = company1.getDepartments();
        departments[0] = department1;
        departments[1] = department2;

        for(int i = 0; i < 2; i++) {
            System.out.println(departments[i]);
        }

        System.out.println(department1.equals(department2));



    }
}