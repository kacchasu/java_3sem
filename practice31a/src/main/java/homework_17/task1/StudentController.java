package homework_17.task1;

public class StudentController {
    private Student model;
    private StudentView studentView;

    public StudentController(Student model, StudentView studentView) {
        this.model = model;
        this.studentView = studentView;
    }

    public String getStudentRollNo(){
        return model.getRollNo();
    }
    public String getStudentName(){
        return model.getName();
    }
    public void setStudentRollNo(String rollno){
        model.setRollNo(rollno);
    }
    public void setStudentName(String rollno){
        model.setName(rollno);
    }
    public void updateView(){
        studentView.printStudentDetails(model.getRollNo(), model.getName());
    }
}
