package ArraysDemo;
import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListDemo {
    public static void main(String[] args) {
        int[] arr = new int[10]; //to declare an array
        arr[0]  = 1;
        arr[1] = 2;
        System.out.println(Arrays.toString(arr));

        ArrayList<Integer> alist = new ArrayList<Integer>();
        alist.add(1);
        alist.add(2);
        alist.add(3);
        System.out.println(alist);

        System.out.println(Arrays.toString(alist.toArray()));

        ArrayList<Integer> evens = new ArrayList<Integer>();
        evens.add(2); evens.add(4); evens.add(6);
        System.out.println(Arrays.toString(evens.toArray()));
        System.out.println(evens);

        int sizeOfArrayListEven = evens.size();
        System.out.println(sizeOfArrayListEven);

    }
}
