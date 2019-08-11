package HomeworkEnum;

public enum Month {
    DECEMBRE(31), JENVIER(31), FEVRIER(28),
    MARS(31), AVRIL(30), MAI(31),
    JUIN(30), JUILLER(31), AOUT(31),
    SEPTEMBRE(30), OCTOBRE(31), NOVEMBRE(30);
    private int countDays;
    Month(int givencountDays) {
        this.countDays = givencountDays;
    }
    public int getValue() {
        return countDays;
    }
}
