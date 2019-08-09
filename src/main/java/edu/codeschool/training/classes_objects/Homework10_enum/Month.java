package edu.codeschool.training.classes_objects.Homework10_enum;

public enum Month {
    JANUARY(31) {
        @Override
        int getOrder() {
            return 1;
        }
    },
    FEBRUARY(28) {
        @Override
        int getOrder() {
            return 2;
        }
    },
    MARCH(31) {
        @Override
        int getOrder() {
            return 3;
        }
    },
    APRIL(30)
            {
                @Override
                int getOrder() {
                    return 4;
                }
            },
    MAY(31)
            {
                @Override
                int getOrder() {
                    return 5;
                }
            },
    JUNE(30)
            {
                @Override
                int getOrder() {
                    return 6;
                }
            },
    JULY(31)
            {
                @Override
                int getOrder() {
                    return 7;
                }
            },
    AUGUST(31)
            {
                @Override
                int getOrder() {
                    return 8;
                }
            },
    SEPTEMPER(30)
            {
                @Override
                int getOrder() {
                    return 9;
                }
            },
    OCTOBER(31)
            {
                @Override
                int getOrder() {
                    return 10;
                }
            },
    NOVEMBER(30)
            {
                @Override
                int getOrder() {
                    return 11;
                }
            },
    DECEMBER(31)
            {
                @Override
                int getOrder() {
                    return 12;
                }
            };
    private int dayscount;

    Month(int dayscount) {
        this.dayscount = dayscount;
    }

    abstract int getOrder();


    @Override
    public String toString() {
        return "Month name is " + name() + " , order = " + getOrder() + " , dayscount = " + this.dayscount + " ! ";
    }
}

