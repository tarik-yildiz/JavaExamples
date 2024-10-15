package StringObject;

public class StringDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder stringBuilder = new StringBuilder();
        processString(stringBuilder);
        processString(stringBuffer);
    }

    private static void processString(StringBuilder sb) {
        System.out.println("#######################");
        sb.append("Hello World");
        System.out.println("String: " + sb);
        System.out.println("Reverse String: " + sb.reverse());
        sb.reverse();
        System.out.println("Replace String: " + sb.replace(0, 5, "merhaba"));
        sb.append("This ");
        sb.append("is ");
        sb.append("a ");
        sb.append("test. ");
        System.out.println(sb);
        sb.setCharAt(10, '!');
        System.out.println(sb);
        sb.delete(19, sb.length());
        System.out.println(sb);
        sb.replace(sb.length() - 1, sb.length() + 2, ":)");
        System.out.println(sb);
    }

    private static void processString(StringBuffer sb) {
        sb.append("Hello World");
        System.out.println("String: " + sb);
        System.out.println("Reverse String: " + sb.reverse());
        sb.reverse();
        System.out.println("Replace String: " + sb.replace(0, 5, "merhaba"));
        sb.append("This ");
        sb.append("is ");
        sb.append("a ");
        sb.append("test. ");
        System.out.println(sb);
        sb.setCharAt(10, '!');
        System.out.println(sb);
        sb.delete(19, sb.length());
        System.out.println(sb);
        sb.replace(sb.length() - 1, sb.length() + 2, ":)");
        System.out.println(sb);
    }
}
