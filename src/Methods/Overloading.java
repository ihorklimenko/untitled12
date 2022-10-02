package Methods;
// when overloading same name have same parameters
/* int myMethod(int x);
   float myMethod(float x);
   double myMethod(double x, double y);  */
public class Overloading {
    static int plusMethodInt(int x, int y){
        return x + y;
    }
    static double plusMethodDouble(double x, double y){
        return x + y;
    }
    //
    static int plusMethod(int x,int y){
        return x + y;
    }
    static double plusMethod(double x, double y){
        return x + y;
    }

    public static void main(String[] args){
        int myNum1 = plusMethodInt(8,5);
        double myNum2 = plusMethodDouble(4.3 , 6.26);
        System.out.println("int " + myNum1);
        System.out.println("double " + myNum2);

        /*Instead of defining two methods that
        should do the same thing, it is better to overload one.*/

        int myyNum1 = plusMethod(8,5);
        double myyNum2 = plusMethod(4.3, 6.26);
        System.out.println("int " + myyNum1);
        System.out.println("double " + myyNum2);

        /* Multiple methods can have the same name
        as long as the number and/or type of parameters are different */
    }

}
