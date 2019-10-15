package com.brunoyam.unit_6.calendar;

import com.brunoyam.unit_6.calendar.enums.DayOfWeek;
import com.brunoyam.unit_6.calendar.enums.Month;
import com.brunoyam.unit_6.calendar.enums.Season;

/*
Добавить конструктор с одним параметром firstDay типа com.brunoyam.unit_6.calendar.enums.DayOfWeek.
Устанавливать значение поля firstDay в конструкторе.

Добавить метод, определяющий по номеру дня какой это день недели (понедельник, вторник, .....).

Добавить метод, определяющий по номеру дня сезон, месяц и день недели, и возвращающий строку вида
"сезон + месяц + число + день недели" в нижнем регистре на разных языках, в зависимости от переданного значения.
Например, для дня 33:
"зима февраль 2 понедельник"
"winter february 2 monday"
 */
public class Calendar {

    //Установите значение этого поля в конструкторе
    private DayOfWeek firstDay = DayOfWeek.MONDAY;

    //Добавьте конструктор с одним параметром firstDay.

    public Month monthByDayNumber(Integer dayNumber) throws Exception {
        if (dayNumber <= 0) throw new Exception("Day number can not be less than 1.");

        for (Month month: Month.values()) {
            dayNumber -= month.getDaysNumber();
            if(dayNumber <= 0) return month;
        }

        throw new Exception("Too large day number.");
    }

    public Season seasonByDayNumber(int dayNumber) throws Exception {
        Season result;
        Month month = monthByDayNumber(dayNumber);

        switch (month) {
            case DECEMBER:
            case JANUARY:
            case FEBRUARY: result = Season.WINTER; break;
            case MARCH:
            case APRIL:
            case MAY: result = Season.SPRING; break;
            case JUNE:
            case JULY:
            case AUGUST: result = Season.SUMMER; break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER: result = Season.AUTUMN; break;
            default: result = null;
        }
        return result;
    }

    /*
    Добавьте метод определяющий по номеру дня какой это день недели (понедельник, вторник, .....).
    метод принимает один параметр типа int и возвращает значение типа com.brunoyam.unit_6.calendar.enums.DayOfWeek.
     */

    /*
    Добавьте метод определяющий по номеру дня сезон, месяц и день недели, и возвращающий строку вида
    "сезон + месяц + число + день недели" в нижнем регистре на разных языках, в зависимости от переданного значения.
    Например, для дня 33:
    "зима февраль 2 понедельник"
    "winter february 2 monday"
    метод принимает два параметра типа int и типа com.brunoyam.unit_6.calendar.enums.DayOfWeek,
    и возвращает значение типа String.
     */

}
