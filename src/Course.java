abstract class Course {
    //TODO 3: include instance variables for Course class and complete constructor code

    Subject subject;
    String instructor;
    int courseFee;
    int assignmentMarks, quizMarks;

    public Course(Subject subject, String instructor, int courseFee) {
        this.subject = subject;
        this.instructor = instructor;
        this.courseFee = courseFee;
    }

}
