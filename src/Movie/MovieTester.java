package Movie;

public class MovieTester {
    public static void main(String[] args) {
        Movie m1 = new Movie();
        System.out.println(m1);

        //UP,2009,Pete Docter, Ed Asner
        Movie up = new Movie();
        up.setTitle("Up");
        up.setYear(2009);
        up.setDirector("Pete Docter");
        up.setLeadingRole("Ed Asner");

        System.out.println(up);

        //Don Juan DeMarco, 1995, Jeremy Leven, Johnny Depp
        Movie djd = new Movie("Don Juan DeMarco",1995, "Jeremy Leven","Johnny Depp");
        System.out.println(djd);

    }
}
