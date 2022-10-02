package HomeTask;

import java.util.Scanner;

public class HomeTask2 {

    public static void main(String[] args) {
        // #1
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = myObj.nextInt();
        System.out.println("Your number is " + number);
        int total = 0;

        for (int a = 1; a < number; a++ ){
            if (a % 2 != 0) {
                total = total + a;
                System.out.println("Непарне число: " + a);
            }
        }
        System.out.println("Сумма непраних чиел " + total);
        /*for ( int i = number; i < 100; i++ ){
            if (i % 2 != 0){
                total = total + i;
                System.out.println("Непарне число " + i);
            }
        }
        System.out.println("Сумма непарних чисел = " + total);*/
        // #2 (10...50)/3 = 0
        for (int i = 10; i < 50 ; i++) {
            if (i % 3 == 0){
                System.out.println(i);
            }

        }
        // #3 Прості числа
        Scanner myNumber = new Scanner(System.in);
        System.out.println("Enter your number");
        int num = myNumber.nextInt();
        System.out.println("Your number " + num);
        boolean abc = true;

        for(int i = 2; i<= num/2; i++){
            int number_check = num % 1;
            if (number_check == 0){
                abc = false;
                break;
            }
        }
        if (abc){
            System.out.println("Простое");
        } else {
            System.out.println("Cложное");
        }
        //4 Перші 20 чисел Фібоначі + середнє значення
        int number0 = 1;
        int number1 = 1;
        double sum = number0+number1;
        int x = 20;
        System.out.println(number0 + " "+ number1 );
        for (int i = 3; i <= x; i++) {
            int number2 = number0 + number1;
            System.out.println(number2+" ");
            number0 = number1;
            number1 = number2;
            sum += number2;
        }
        System.out.println();
        System.out.println("Сумма " + sum);
        System.out.println("Середнє значення " + sum/x);

    }
}