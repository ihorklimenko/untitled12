package Methods;

public class MultipleParameters {
    static void myMethod(String name, int age){
        System.out.println( name + " " + age);
    }
    public static void main(String[] args){
        myMethod("JACKIE", 5);
        myMethod("SATI", 9);
        myMethod("ANJA", 18);
    }
}
