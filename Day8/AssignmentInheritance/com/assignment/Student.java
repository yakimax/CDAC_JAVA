package Day8.AssignmentInheritance.com.assignment ;
import Day8.AssignmentInheritance.com.assignment.Person ;
public class Student extends Person {
    int studentID = 1 ;
    char grade = 'A';
    public void displayStudentDetails(){
        System.out.println(studentID+"" +'\n'+""+grade) ;
    }
}
