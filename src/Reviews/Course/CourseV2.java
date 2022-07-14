package Reviews.Course;

import java.util.ArrayList;

public class CourseV2 {
    private String courseName;
    private ArrayList<String> students = new ArrayList<>();
    private int numberOfStudents;

    public CourseV2(String courseName){
        this.courseName = courseName;
    }

    public void addStudent(String student){
        students.add(student);
    }
    public ArrayList<String> getStudents(){
        return students;
    }

    public int getNumberOfStudents(){
        return students.size();
    }

    public String getCourseName(){
        return courseName;
    }

    /** Remove a student from the course */
    public void dropStudent(String student) {
         students.remove(student);
    }
}
