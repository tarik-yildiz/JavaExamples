package Constructors;

/***
 * @author tarik-yildiz
 */
public class Human {
    private String name;
    private int age;
    private int childCount=0;
    private String jobName="Unemployed";
    private long salary=0;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Constructor 1- [name: "+name+"] [age: "+age+"] set");
    }

    public Human(String name, int age, int childCount) {
        this(name, age);
        this.childCount = childCount;
        System.out.println("Constructor 2- [childCount: "+childCount+"] set");
    }

    public Human(String name, int age, int childCount, String jobName, long salary) {
        this(name, age, childCount);
        this.jobName = jobName;
        this.salary = salary;
        System.out.println("Constructor 3- [jobName: "+jobName+"] [salary: "+salary+"] set");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", childCount=" + childCount +
                ", jobName='" + jobName + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
        Human human=new Human("Adem",  39);
        Human human2=new Human("Ayşe",  30,3);
        Human human3=new Human("Ali",  28,1,"Developer",13000);
        System.out.println(human);
        System.out.println(human2);
        System.out.println(human3);
    }
}
