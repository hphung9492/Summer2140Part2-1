package DistinctValueP;

public class DistinctValue {

    public static void main(String[] args) {
        DistinctValue dv = new DistinctValue();
        int[] arr = {23,45,67,89,10,10,10,10,45,67};
        dv.printDistinct(arr,arr.length);
        dv.printDistinct(new int[]{1,1,2,3,3,4,7,5,6},9);
    }

    public void printDistinct(int arr[], int lengthOfArray)
    {
        for(int i = 0; i < lengthOfArray; i++)
        {
            int j;
            for( j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    break;
                }
            }
                if(i == j)
                {
                    System.out.print(arr[i] + " ");
                }
            }
        System.out.println();
        }
    }

