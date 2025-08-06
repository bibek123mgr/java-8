public enum Days {
    SUNDAY(true),
    MONDAY(false),
    TUESDAY(false),
    WEDNESDAY(false),
    THUSDAY(false),
    FRIDAY(false),
    SATURDAY(true);

    private final boolean isWeekend;

    Days(boolean isWeekend) {
        this.isWeekend = isWeekend;
    }

    public String getType() {
        return isWeekend ? "WeekDay" : "Workday";
    }
}
