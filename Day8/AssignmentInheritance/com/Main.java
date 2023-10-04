package Day8.AssignmentInheritance.com ;
import Day8.AssignmentInheritance.com.assignment.* ;
import Day8.AssignmentInheritance.com.assignment2.*;
public class Main {
    public static void main(String[] args) {
        Person p = new Person() ;
        p.displayDetails() ;
        Student s = new Student() ;
        s.displayStudentDetails() ;
        Teacher t = new Teacher() ;
        t.displayTeacherDetails() ;
        Course c = new Course() ;
        c.displayCourseDetails() ;
    }
}
