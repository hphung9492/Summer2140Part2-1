package AddPackage;

public class AddNumber {

    public static void main(String[] args) {
        AddNumber an = new AddNumber();
        an.add(15,3);
        System.out.println(an.add(15,3));
        int result = an.add(12,6);
        System.out.println(result);

        int resultStatic = AddNumber.addStatic(10,20);
        System.out.println(resultStatic);
    }

    /**
     * method: add method - instance method (or non-static method)
     * @param firstNum
     * @param secondNum
     * @return sum of firstNum and secondNum
     */
    public int add(int firstNum, int secondNum)
    {
        return firstNum + secondNum;
    }

    /**
     * method: addStatic - static/class method.
     * this method must call by the class
     * @param firstNum
     * @param secondNum
     * @return
     */
    public static int addStatic(int firstNum, int secondNum)
    {
        return firstNum + secondNum;
    }
}
