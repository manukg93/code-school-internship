package edu.codeschool.training.classes_objects.homework7.client;

import edu.codeschool.training.classes_objects.homework7.exercise2.Address;
import edu.codeschool.training.classes_objects.homework7.exercise2.Company;
import edu.codeschool.training.classes_objects.homework7.exercise2.Contact;
import edu.codeschool.training.classes_objects.homework7.exercise2.Department;

public class Equals {
    public static void main(String[] args) {
        Address address = new Address("Armenia", "Yerevan", "Abovyan st.", 0025l);
        Contact contact = new Contact("1@1.com", "+37493113720", "+37498113720");
        Department department = new Department("John", 11l);
        Company company = new Company("companyName", address, department, contact);
        System.out.println(company);
    }
}
