package Reviews.Course;

import java.util.concurrent.TimeUnit;

public class TesterCourseV2 {
    public static void main(String[] args) throws InterruptedException {
        CourseV2 course1 = new CourseV2("Fundamental Programming");
        CourseV2 course2 = new CourseV2("Intermediate Programming");

        course1.addStudent("Raymond Hardy");
        course1.addStudent("Susan Sass");
        course1.addStudent("Peter Parker");
        course1.addStudent("Jack Russel");

        course2.addStudent("Pearl Park");
        course2.addStudent("Sarah Jessica");
        course2.addStudent("Tom Bradley");
        course2.addStudent("Ray Donna");

        System.out.println("Number of students in course1: " + course1.getNumberOfStudents());
        System.out.println("List of Students in ITEC 2140: " + course1.getStudents());

        System.out.println("Number of students in course2: " +  course2.getNumberOfStudents());
        System.out.println("List of Students in ITEC 2150: " + course2.getStudents());


        TimeUnit.SECONDS.sleep(2);

        System.out.println("Now you can add more students to course 1: ITEC 2140 ");
        System.out.println("How many do you want to add? Must be more then 0 ");
        java.util.Scanner input = new java.util.Scanner(System.in);
        int num = input.nextInt() ;
        String studentName;
        do{
            if (num <= 0) {
                System.out.println("Error: Must enter number higher than 0.");
                System.out.println("How many do you want to add? Must be more than 0");
                num = input.nextInt();
            }
            }while(num <= 0);

           System.out.println("Great job! Wait for 10 Seconds to receive next task." );
        TimeUnit.SECONDS.sleep(10);

        System.out.println("You can enter Names now");
        input.nextLine();
            for(int i = 0; i < num; i++) {
                course1.addStudent(input.nextLine());
            }
        System.out.println(course1.getStudents());
        System.out.println("Great job! Wait for 10 Seconds to receive next task." );
        TimeUnit.SECONDS.sleep(10);
        System.out.println("Now you will remove the first student of the ITEC 2140" +
                " course. ");
        System.out.println("Wait another 10 seconds. ");
        TimeUnit.SECONDS.sleep(10);

        System.out.println("Drop a student's name from ITEC 2140 - Type the " +
                "student name to drop:");
        String nameToDrop = input.nextLine();
        course1.dropStudent(nameToDrop);
        TimeUnit.SECONDS.sleep(10);

        System.out.println("Student List of ITEC 2140 is : " + course1.getStudents());

    }
}
