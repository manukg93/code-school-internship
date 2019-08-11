package HomeworkEnum;

public enum WeekDays {
    LUNDI("Lundi"), MARDI("Mardi"), MERCREDI("Mercredi"),
    JEUDI("Jeudi"), VENDREDI("Vendredi"), SAMEDI("Samedi"), DIMANCHE("Dimanche");
private String days;
WeekDays(String givenDays) { this.days = givenDays; }
    public String getDays() { return days; }
    public String getValue() { return days; }
}
