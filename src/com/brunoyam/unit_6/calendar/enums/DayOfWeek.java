package com.brunoyam.unit_6.calendar.enums;

public enum DayOfWeek {

    MONDAY(1, "Monday", "Понедельник"),
    TUESDAY(2, "Tuesday", "Вторник"),
    WEDNESDAY(3, "Wednesday", "Вторник"),
    THURSDAY(4, "Thursday", "Четверг"),
    FRIDAY(5, "Friday", "пятница"),
    SATURDAY(6, "Saturday", "Суббота"),
    SUNDAY(7, "Sunday", "воскресенье");

    private int number;
    private String nameEn;
    private String nameRu;

    DayOfWeek(int number, String nameEn, String nameRu) {
        this.number = number;
        this.nameEn = nameEn;
        this.nameRu = nameRu;
    }

    public int getNumber() {
        return number;
    }

    public String getNameEn() {
        return nameEn;
    }

    public String getNameRu() {
        return nameRu;
    }
}
