package Day04.MethodsCode;
//design a method which can return student name from the getStudentName() method
public class StundentInformation {

    public String getStudentName(String student_name){
        System.out.println("Student name : "+ student_name);

        return student_name;
    }

    public static void main(String[] args) {
        //Need to call instance method hence creating a object of class
        StundentInformation studentInformation = new StundentInformation();
        String name = studentInformation.getStudentName("Sugat");
    }
}
