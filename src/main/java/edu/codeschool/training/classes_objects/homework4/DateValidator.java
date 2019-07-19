package edu.codeschool.training.classes_objects.homework4;

public class DateValidator{
    //The class has one public method validateDate(Date date) which checks weather the given date is valid or not.
    //By valid we mean that year is greater 0, month is between 1 - 12, day is between 1 - 31.
    private Date date;
    public static void  validateDate(Date date){
        if(date.getYear()>0 && (date.getMonth()>0 && date.getMonth()<=12) &&(date.getDay()>=0 && date.getDay()<=31)){
            System.out.println(" - Valid date");
        }else System.out.println(" - Not valid ! ! ! ");
    }

}