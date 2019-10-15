package com.brunoyam.unit_6;

import com.brunoyam.unit_6.calendar.Calendar;
import com.brunoyam.unit_6.calendar.enums.Month;
import com.brunoyam.unit_6.calendar.enums.Season;

import java.util.Objects;

public class Application {

    public static void main(String[] args) {
        Calendar calendar = new Calendar();

        try {
            Month month = calendar.monthByDayNumber(355);
            print(month.getNameEn());
            Season season = calendar.seasonByDayNumber(355);
            print(season.getNameEn());
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static void print(String message) {
        System.out.println(message);
    }

}
