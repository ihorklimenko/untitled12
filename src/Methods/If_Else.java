package Methods;

public class If_Else {
    static void checkAge(int age){
        if(age<18){
            System.out.println("You are not old enough");
        } else {
            System.out.println("You are old enough");
        }
    }

    public static void main(String[] args) {
        checkAge(10);
        checkAge(15);
        checkAge(20);
    }
}
