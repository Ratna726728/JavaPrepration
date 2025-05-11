package Day04.MethodsCode.Sample;


public class Test {

    public static Employee getEmployeeDetails(){
        int id = 10;
        String name = "Nilesh";
        String city = "Mumbai";

        return new Employee(id, name, city);
    }

    public static void main(String[] args) {
        Employee emp = getEmployeeDetails();
        System.out.println("id: "+emp.id);
        System.out.println("name: "+emp.name);
        System.out.println("city: "+emp.city);
    }
}
