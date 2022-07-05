package AddPackage;

public class AddNumberTester {
    public static void main(String[] args) {
        //call add method which is defined in AddNumber class
        AddNumber anc = new AddNumber();
        System.out.println(anc.add(10,20));

        //call addStatic method which is defined in AddNumber class and it is a
        // static method.
        System.out.println(AddNumber.addStatic(24,56));

    }
}
