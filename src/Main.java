import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        //TODO 8: declare and initialize the object of ClassroomCourse class
        String subjectTitle = "Computer Science";
        double requiredCredits = 420;
        Subject subject = new Subject(subjectTitle, requiredCredits);
        ClassroomCourse classroomCourse = new ClassroomCourse(subject, "Yousef", 25, "Rhodes University", "Data structures");
        //TODO 9: declare and initialize the Learner object
        Learner learner = new Learner("Sinawo", 7, classroomCourse, 7);
        System.out.println(learner.toString());
        //TODO 18: display course list and accept user choice
        System.out.println("Choose preferred course from the following");
        System.out.println("1 = Java \n2 = Java Online \n3 = JavaScript \n4 = JavaScript Online" );
        System.out.print("Enter your choice: ");

        //TODO 19: initialize object of chose course
        int courseChoice = (keyboard.nextInt());
        System.out.println();


        //TODO 20: accept user input for learner's name
        System.out.print("Enter the leaner's name: ");
        String learnerName = keyboard.next();
        System.out.println();

        //TODO 21: call assignmentScore() method and quizScore() methods

        //TODO 22: call assignmentScore() method. Display the result as described
    }
}