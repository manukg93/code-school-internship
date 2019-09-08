package edu.codeschool.training.classes_objects.homework_17_Collection;

import java.util.Comparator;

public class UserAgeComparator implements Comparator<User> {

    @Override
    public int compare(User o1, User o2) {

            return o2.compareTo(o1);
        }
    }