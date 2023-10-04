package Day8.AssignmentInheritance.com.assignment ;
import Day8.AssignmentInheritance.com.assignment.Person ;
public class Teacher extends Person{
    int employeeID = 2 ;
    String subject = "Science" ;
    public void displayTeacherDetails(){
        System.out.println(employeeID+""+'\n'+""+subject) ;
    }
}
