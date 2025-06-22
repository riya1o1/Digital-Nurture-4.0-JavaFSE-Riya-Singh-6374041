package mvcpatternexample;

public class TestStudentMVC {
    public static void main(String[] args) {
        
        Student student = new Student("Riya", "S101", "A");

        StudentView view = new StudentView();

        StudentController controller = new StudentController(student, view);

        controller.updateView();

        controller.setStudentName("Riya Singh");
        controller.setStudentGrade("A+");

        controller.updateView();
    }
}
