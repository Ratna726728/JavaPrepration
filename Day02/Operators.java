package Day02;

public class Operators {
    public void arithmeticOper(int num1, int num2 ){
        System.out.println("Arithmetic operator operations:");
        int result1=num1+num2;
        System.out.println("Addition : "+result1);
        int result2=num1-num2;
        System.out.println("Subtraction : "+result2);
        int result3=num1*num2;
        System.out.println("Multiplication : "+result3);
        int result4=num1/num2;
        System.out.println("Division : "+result4);
        int result5=num1%num2;
        System.out.println("Modulus : "+result5);
    }
    public void logicalOper(int num1, int num2){
        System.out.println("Logical Operator:");
        System.out.println((num1 > num2) && (num1 < num2));
        System.out.println((num1 > num2) || (num1 < num2));
    }
    public void relationalOper(int num1, int num2){
        System.out.println("Relational Operator : ");
        System.out.println(num1>num2);
        System.out.println(num1<num2);
        System.out.println(num1>=num2);
        System.out.println(num1<=num2);
        System.out.println(num1!=num2);
    }
    public void bitwiseOper(int num1, int num2){
        System.out.println("Bitwise Operator : ");
        System.out.println((num1 > num2) & (num1 < num2));
        System.out.println((num1 > num2) | (num1 < num2));

    }
    public void unaryOper(int num1, int num2){
        System.out.println("Unary Operator : ");
        System.out.println("before increment : num1 ="+num1);
        System.out.println("Increment: "+ (++num1));
        System.out.println("before decrement : num2 ="+num2);
        System.out.println("decrement: "+ (--num2));

    }
    public void ternaryOper(int num1, int num2){
        System.out.println("Ternary Operator : ");
        System.out.println((num1>num2)?num1:num2);

    }
    public void shiftOper(int num1, int num2){
        System.out.println("Shift Operator: ");
        System.out.println("variable num1 = "+num1);
        System.out.println(num1>>2);
        System.out.println("after right shifting : "+num1);
        System.out.println("variable num2 = "+num2);
        System.out.println(num2<<3);
        System.out.println("after right shifting : "+num2);


    }

    public static void main(String[] args) {
        int num1 = 35;// assignment operator
        int num2 = 45;

        Operators operators = new Operators(); // new operator is used here
        operators.arithmeticOper(num1,num2);// dot operator is used here
        System.out.println();
        operators.logicalOper(num1, num2);
        System.out.println();
        operators.relationalOper(num1, num2);
        System.out.println();
        operators.bitwiseOper(num1, num2);
        System.out.println();
        operators.unaryOper(num1, num2);
        System.out.println();
        operators.ternaryOper(num1,num2);
        System.out.println();
        operators.shiftOper(num1, num2);
        System.out.println();

    }
}
