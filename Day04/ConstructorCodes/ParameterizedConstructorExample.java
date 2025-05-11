package Day04.ConstructorCodes;

public class ParameterizedConstructorExample {

    int id;
    String name;
    String city;

    public ParameterizedConstructorExample(int userId, String userName, String userCity){
        id = userId;
        name = userName;
        city = userCity;

        System.out.println("id : "+id);
        System.out.println("name : "+ name);
        System.out.println("city : "+city);
    }

    public static void main(String[] args) {
        ParameterizedConstructorExample parameterizedConstructorExample = new ParameterizedConstructorExample(20,"Ashish", "Mumbai");
    }
}
