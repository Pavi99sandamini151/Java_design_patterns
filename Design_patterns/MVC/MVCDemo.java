package Employee;

public class MVCDemo {
    public static void main(String[] args){

        Employee emp = retriveEmployeeFromDatabase();
        EmployeeView view1 = new EmployeeView();
        EmployeeController empcon = new EmployeeController(emp,view);

        empcon.updateView();
    }

    public static Employee retriveEmployeeFromDatabase(){
        Employee employee1 = new Employee();
        employee1.setName("pavithra");
        employee1.setRollNo("20");

        return employee1;
    }
}