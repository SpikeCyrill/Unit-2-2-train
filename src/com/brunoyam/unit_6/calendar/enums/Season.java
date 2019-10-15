package com.brunoyam.unit_6.calendar.enums;

public enum Season {

    WINTER("Winter", "Зима"),
    SPRING("Spring", "Весна"),
    SUMMER("Summer", "Лето"),
    AUTUMN("Autumn", "Осень");

    private String nameEn;
    private String nameRu;

    Season(String nameEn, String nameRu) {
        this.nameEn = nameEn;
        this.nameRu = nameRu;
    }

    public String getNameEn() {
        return nameEn;
    }

    public String getNameRu() {
        return nameRu;
    }
}
