package Day04.MethodsCode;

public class EmployeeInformation {
    int id =10;
    String name = "Rajat";
    String city = "Pune";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }



    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "EmployeeInformation{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }

    public EmployeeInformation addEmployee(){

        EmployeeInformation employeeInfo = new EmployeeInformation();

        employeeInfo.setId(id);
        employeeInfo.setName(name);
        employeeInfo.setCity(city);
        return employeeInfo;
    }

    public static void main(String[] args) {
        EmployeeInformation employeeInformation = new EmployeeInformation();
        EmployeeInformation employee = employeeInformation.addEmployee();

        System.out.println("Employee data is : "+ employee);
    }
}
