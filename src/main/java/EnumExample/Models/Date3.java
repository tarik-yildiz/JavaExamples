package EnumExample.Models;


import EnumExample.Enums.DayOfMonth;
import EnumExample.Enums.Month;
import EnumExample.Enums.Year;

public class Date3 {
    DayOfMonth dayOfMonth;
    Month month;
    Year year;
    public Date3(DayOfMonth dayOfMonth, Month month, Year year) {
        this.dayOfMonth = dayOfMonth;
        this.month = month;
        this.year = year;
    }
}
