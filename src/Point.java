public class Point {
    //attribute and their visibility is private
    private int x;
    private int y;

    //behavior
    //constructor  - no argument constructor
    public Point()
    {
    }

    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public int getX()
    {
        return x;
    }

    public int getY()
    {
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y)
    {
        this.x = y;
    }

    public String toString()
    {
        return "(" + this.x + ", " + this.y + ")";
    }
}

