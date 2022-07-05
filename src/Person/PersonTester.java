package Person;

public class PersonTester {
    public static void main(String[] args) {
        Person raven = new Person();
        System.out.println(raven);
        raven.setName("Brian");
        System.out.println(raven.getName());
        System.out.println(raven);
        raven.setAge(10);
        System.out.println(raven);
    }
}
