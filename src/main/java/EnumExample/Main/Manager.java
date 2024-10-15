package EnumExample.Main;


import EnumExample.Enums.DayOfMonth;
import EnumExample.Enums.Month;
import EnumExample.Enums.Size;
import EnumExample.Enums.Year;
import EnumExample.Models.Date3;

public class Manager {
    public static void main(String[] args) {
        Size size1=Size.LARGE;
        String name=size1.name();
        System.out.println("Enum: "+name + " - "+size1);
        System.out.println("Ordinal: "+size1.ordinal());
        System.out.println("Abbreviation: "+size1.getAbbreviation());
        System.out.println("No: "+size1.getNo());

        Date3 date3=new Date3(DayOfMonth.DAY_8, Month.MAY, Year.YEAR_2026);
    }
}
