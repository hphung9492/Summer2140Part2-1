package Reviews;

import java.util.Scanner;

public class RectangleSize
{
    private int side1, side2;
    private Scanner input;

    public void getSides()
    {
        System.out.println("Please enter side 1");
        side1 = input.nextInt();
        System.out.println("Please enter side 2");
        side2 = input.nextInt();
    }

    public int getArea(int side1, int side2)
    {
        return side1 * side2;
    }

    public boolean isLarge(int area)
    {
        boolean large;
        if(area > 400)
        {
            large = true;
        }
        else
        {
            large = false;
        }
        return large;
    }
    public void printSize(boolean large)
    {
        if (large)
        {
            System.out.println("This is a large rectangle");
        }
        else
        {
            System.out.println("This is a small rectangle");
        }
    }

    public static void main(String[] args)
    {
        RectangleSize rs = new RectangleSize();
        rs.input = new Scanner(System.in);
        rs.getSides();
        int area = rs.getArea(rs.side1, rs.side2);
        boolean large = rs.isLarge(area);
        rs.printSize(large);
        rs.input.close();
    }

}
