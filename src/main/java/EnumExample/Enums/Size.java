package EnumExample.Enums;

public enum Size {
    SMALL("S",1),MEDIUM("M",2),LARGE("L",3),XLARGE("XL",4);
    private String abbreviation;
    private int no;
    private static String description;

    static {
        System.out.println("in static initializer block");
        description="These are sizes.";
    }

    {
        System.out.println("in object initializer block");
    }


    Size(String abbreviation, int no){
        this.abbreviation=abbreviation;
        this.no=no;
    }

    public int getNo() {
        return no;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public static String getDescription() {
        return description;
    }
}
