package DistinctValueP;

public class DistinctValueTester {
    public static void main(String[] args) {
        DistinctValue paul = new DistinctValue();
        int[] xArr = {45,67,3,3,4,4,5,5,6};
         paul.printDistinct(xArr, xArr.length);
    }
}
