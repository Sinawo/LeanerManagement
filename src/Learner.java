//TODO 12: make Learner class implement Assessment interface
public class Learner implements Assessments {
    //TODO 1: declare instance variables

     String name;
     double grade;
     Course course;
     double gradeScore;

    public Learner(String name, Course course) {
        this.name = name ;
        this.grade = grade;
        this.course = course;
        this.gradeScore = gradeScore;
        //TODO 2: complete constructor
    }

    public String toString() {
        return "Name: " + this.name + " " + "Course: " + this.course.subject.title;
    }


    //TODO 13: override assignmentScore() method


    @Override
    public void assignmentScore(int marks) {
        this.course.quizMarks = marks;
        System.out.println("Learner Assignment Score: " + marks);

    }

    //TODO 14: override quizScore() method
    @Override
    public void quizScore(int marks) {
        this.course.quizMarks = marks;
        System.out.println("Learner Quiz Score: " + marks);
    }

    public double calculateGrade() {
        int maxAssignmentMarks, maxQuizMarks;
        //TODO 17: calculate gradeScore as per the instructions above
       if(this.course.subject.title.contains("Online")){
           maxAssignmentMarks = 30;
           maxQuizMarks =10;
       }else {
           maxAssignmentMarks = 100;
           maxQuizMarks = 30;
       }
       double quizScore = (double)(this.course.quizMarks/maxQuizMarks ) * 10;
       double assignmentScore = (double)(this.course.assignmentMarks/maxQuizMarks) * 10;
       this.gradeScore = (quizScore  + assignmentScore) / 2;
        return this.gradeScore;
    }
}
