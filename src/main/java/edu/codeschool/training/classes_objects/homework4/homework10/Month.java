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
            case JANUARY: System.out.println(1);break;
            case FEBRUARY:System.out.println(2);break;
            case MARCH:   System.out.println(3);break;
            case APRIL:   System.out.println(4);break;
            case MAY:     System.out.println(5);break;
            case JUNE:    System.out.println(6);break;
            case JULY:    System.out.println(7);break;
            case AUGUST:  System.out.println(8);break;
            case SEPTEMBER:System.out.println(9);break;
            case OCTOBER: System.out.println(10);break;
            case NOVEMBER:System.out.println(11);break;
            case DECEMBER:System.out.println(12);
            default:
        }
    }




    @Override
    public String toString() {
        return " Month   "+name()+  "   daysCount     " + daysCount  ;
    }


    }




