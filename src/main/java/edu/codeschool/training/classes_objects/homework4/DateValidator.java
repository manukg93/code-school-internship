package edu.codeschool.training.classes_objects.homework4;

import edu.codeschool.training.classes_objects.homework4.Date;

public class DateValidator {

    // Public methods
    public boolean validateDate (Date date) {
        if (date.getYear() > 0) {
            if (date.getMonth() >= 1 && date.getMonth() <= 12) {
                if (date.getDay() >= 1 && date.getDay() <= 31) {
                    return true;
                }
            }
        }

        return false;
    }
}
