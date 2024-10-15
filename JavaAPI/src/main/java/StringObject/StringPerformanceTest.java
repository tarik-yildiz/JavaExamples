package StringObject;

public class StringPerformanceTest {
    public static void main(String[] args) {
        buildStringWithPlus("Java",100000);
        buildStringWithStringBuilder("Java",100000);
        buildStringWithStringBuffer("Java",100000);

    }

    private static void buildStringWithPlus(String string, int i) {
        long start = System.currentTimeMillis();
        for (int j = 0; j < i; j++) {
            string=string+j;
        }
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start));
    }
    private static void buildStringWithStringBuilder(String string, int i) {
        StringBuilder stringBuilder=new StringBuilder(string);
        long start = System.currentTimeMillis();
        for (int j = 0; j < i; j++) {
            stringBuilder.append(j);
        }
        long end = System.currentTimeMillis();
        System.out.println("With StringBuilder Time: " + (end - start));
    }
    private static void buildStringWithStringBuffer(String string, int i) {
        StringBuffer stringBuffer=new StringBuffer(string);
        long start = System.currentTimeMillis();
        for (int j = 0; j < i; j++) {
            stringBuffer.append(j);
        }
        long end = System.currentTimeMillis();
        System.out.println("With StringBuffer Time: " + (end - start));
    }
}
