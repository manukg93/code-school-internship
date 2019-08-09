package edu.codeschool.training.classes_objects.homework4.homework10;

public class MonthTest {

        public static void main(String[] args) {
            for(Month month : Month.values()){
                month.getOrder(month);

                System.out.println(month);
                System.out.println("--------------------------------------");
            }
        }
    }

