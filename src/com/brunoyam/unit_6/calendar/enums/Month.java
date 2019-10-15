package com.brunoyam.unit_6.calendar.enums;

public enum Month {

    JANUARY(31, "January", "Январь"),
    FEBRUARY(28, "February", "Февраль"),
    MARCH(31, "March", "Март"),
    APRIL(30, "April", "Апрель"),
    MAY(31, "May", "Май"),
    JUNE(30, "June", "Июнь"),
    JULY(31, "July", "Июль"),
    AUGUST(31, "August", "август"),
    SEPTEMBER(30, "September", "Сентябрь"),
    OCTOBER(31, "October", "Октябрь"),
    NOVEMBER(20, "November", "Ноябрь"),
    DECEMBER(31, "December", "Декабрь");


    private int daysNumber;
    private String nameEn;
    private String nameRu;

    Month(int daysNumber, String nameEn, String nameRu) {
        this.daysNumber = daysNumber;
        this.nameEn = nameEn;
        this.nameRu = nameRu;
    }

    public int getDaysNumber() {
        return daysNumber;
    }

    public String getNameEn() {
        return nameEn;
    }

    public String getNameRu() {
        return nameRu;
    }
}
