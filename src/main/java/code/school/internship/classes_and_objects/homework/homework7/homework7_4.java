package code.school.internship.classes_and_objects.homework.homework7;

import java.sql.SQLOutput;

public class Integer {
    public static final int SIZE = 32;
    public static final int MIN_VALUE = -2147483648;
    @@ -86,7 +84,7 @@ public Integer minus (Integer other) {
    }

    // Return int from string
    public int parseInt(String number) {
        public static int parseInt(String number) {
            if (number.isEmpty()) {
                return 0;
            }
