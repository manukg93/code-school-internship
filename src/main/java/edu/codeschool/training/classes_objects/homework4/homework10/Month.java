package edu.codeschool.training.classes_objects.homework4.homework10;

public enum Month {
    JANUARY (31) , FEBRUARY (28), MARCH(31), APRIL(30), MAY(31),
    JUNE (30), JULY (31), AUGUST (31), SEPTEMBER (30),
    OCTOBER (31), NOVEMBER (30), DECEMBER (31);

    private int daysCount;


    Month(int daysCount) {
        this.daysCount = daysCount;
    }

    public void getOrder(Month month) {
        switch (month) {
            case JANUARY: System.out.print(1);break;
            case FEBRUARY:System.out.print(2);break;
            case MARCH:   System.out.print(3);break;
            case APRIL:   System.out.print(4);break;
            case MAY:     System.out.print(5);break;
            case JUNE:    System.out.print(6);break;
            case JULY:    System.out.print(7);break;
            case AUGUST:  System.out.print(8);break;
            case SEPTEMBER:System.out.print(9);break;
            case OCTOBER: System.out.print(10);break;
            case NOVEMBER:System.out.print(11);break;
            case DECEMBER:System.out.print(12);

        }
    }




    @Override
    public String toString() {
        return " Month   "+name()+  "   days     " + daysCount  ;
    }


    }




