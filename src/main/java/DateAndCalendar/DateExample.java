package DateAndCalendar;

import java.util.Date;

public class DateExample {

    public static void main(String[] args) throws InterruptedException {

        Date now = new Date();

        now=nowAndThen(now);
        Thread.sleep(2000);
        now=nowAndThen(now);
        Thread.sleep(3000);
        now=nowAndThen(now);
    }

    private static Date nowAndThen (Date then){
        Date now = new Date();
        System.out.println(then+" "+then.getTime());
        System.out.println(now+" "+now.getTime());
        System.out.println(now.after(then));
        System.out.println(then.before(now));
        return now;
    }
}
