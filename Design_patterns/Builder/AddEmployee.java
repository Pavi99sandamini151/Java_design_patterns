package Builder;

public class AddEmployee {
    public static void main(String[] args){
        Employee x = new EmployeeBuilder().setName("nuwan").setAge("24").getEmployee();
        System.out.println(x);
    }
}