package Employee;

public class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model , EmployeeView view){
        this.model = model;
        this.view =view;
    }

    public void setEmployeeName(String name){
        model.setName(name);
    }
    public String getEmployeeName(){
        return model.getname();
    }
    public void setEmployeeRollNo(String rollno){
        model.setRollNo(RolllNo);
    }
    public String getEmployeeRollno(){
        return model.getRollNo();
    }
    public void updateView(){
        view.printEmployeeDetails(model.getName() , model.getRollNo());
    }
}