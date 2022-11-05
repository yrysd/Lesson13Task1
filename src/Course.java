public class Course {

    private String courseName;
    private String instructorName;
    private Student[] students;

    public Course(String courseName, String constructorName, Student[] students){
        for (Student student:students) {
        if ( student.getAge() > 15) {
            System.out.println("It is no possible!");

        }else {


            this.courseName = courseName;
            this.instructorName = constructorName;
            this.students = students;
        }
        }




    }





    void  setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    void setInstructorName(String instructorName){
        this.instructorName = instructorName;
    }
    public String getInstructorName(){
        return instructorName;
    }

    public void getInfo(Student[] students){
        for (Student student:students){
            System.out.println();
            System.out.printf("""
                    CourseName: %s
                    InstructorName: %s
                    Name: %s
                    age: %s
                    write: %s
                    """, getCourseName(), getInstructorName(), student.getName(),student.getAge(),student.getWrite());
        }
    }



}
