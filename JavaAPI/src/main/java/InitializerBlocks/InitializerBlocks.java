package InitializerBlocks;

public class InitializerBlocks {
    int instanceInteger;
    static int staticInteger;

    static {
        System.out.println("Static initializer block");
        staticInteger = 30;
//        instanceInteger = 10;   error
//        static fieldlar nesne oluşturulmadan da var olurlar. bu yüzden nesneyle ilgili bir değişiklik burada yapılmaz.
    }

    {
        System.out.println("Instance initializer block");
        instanceInteger = 10;
    }

    public static void main(String[] args) {
        System.out.println("Main method:");
        System.out.println("Creating instance...");
        InitializerBlocks instance=new InitializerBlocks();

    }
}