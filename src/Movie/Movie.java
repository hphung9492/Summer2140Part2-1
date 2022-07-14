package Movie;

public class Movie  {

    private String title;
    private int year;
    private String director;
    private String leadingRole;

    public Movie() {
        this("Top gun: Maverick", 2022, "Tom Cruise-director", "Tom Cruise");
    }

//    public Movie(String newTitle, int year, String director, String newLR) {
//        this.title = newTitle;
//        this.year = year;
//        this.director = director;
//        this.leadingRole = newLR;
//    }

    public Movie(String title, int year, String director, String lr) {
        this.setTitle(title);
        setYear(year);
        setDirector(director);
        setLeadingRole(lr);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }

    public void setDirector(String d) {
        this.director = d;
    }

    public String getDirector() {
        return director;
    }

    public void setLeadingRole(String lr) {
        this.leadingRole = lr;
    }

    public String getLeadingRole() {
        return leadingRole;
    }

    public String toString() {
        return "Title: " + title + "\nYear Released: " + year + "\nDirector: " +
                director + "\nLeadingRole: " + leadingRole;

    }
}
