class ClassroomCourse extends Course  {
    //TODO 6: add instance variables
    String school;
    String session;

   // public Course(String subject, String instructor, int courseFee, int assignmentMarks, int quizMarks) {


    public ClassroomCourse(Subject subject, String instructor, int fee,
                    String school, String session) {

        //TODO 7: call superclass constructor
        //complete constructor code

        //initialise the Course super class
        super(subject,instructor, fee);
        this.school = school;
        this.session = session;
    }
}
