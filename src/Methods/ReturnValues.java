package Methods;

public class ReturnValues {

    static int myMethod(int x){
        return 5 + x;
    }
    static int myMethod1(int x, int y){
        return x + y;
    }
    public static void main(String[] args){
        System.out.println(myMethod(3)); // print 8
        System.out.println(myMethod1(5, 3)); //x+y =5+3
        int z = myMethod1(5,3);
        System.out.println(z);   // same examples
    }
}
