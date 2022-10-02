package HomeTask;

import java.util.Scanner;
import java.lang.Math;

public class HomeTask1 {

    public static void main(String[] args) {
        //Task1 - Останнє число
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter Number: ");

        int number11 = myObj.nextInt();
        System.out.println(number11);

        int lastNumber = number11%10;
        if (lastNumber == 5)
        {
            System.out.println("Last number is 5 = True");
        }
        else{
            System.out.println(" Last number is not 5 = False");
        }
        //Taks2 - Гривні
        Scanner myObj1 = new Scanner(System.in);
        System.out.println("Введіть сумму : ");
        int summa = myObj1.nextInt();
        if (summa == 1) {
            System.out.println("You have " + summa + " ГривнЯ");
        } else if (summa > 1 && summa < 5){
            System.out.println("You have" + summa + " ГривнІ");
        } else if (summa > 4 && summa < 10){
            System.out.println("You have" + summa + " ГривенЬ");
        } else {
            System.out.println("error");
        }
        //Task3 - Квадратне рівняння
        Scanner a = new Scanner(System.in);
        System.out.println("A = ");
        int a1 = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.println("B = ");
        int b1 = b.nextInt();
        Scanner c = new Scanner(System.in);
        System.out.println("C = ");
        int c1 = c.nextInt();
        System.out.println("Ваші числа А = " + a1 + " B = " + b1 + " C " + c1);
        System.out.println("Розв'яжемо рівняння AX^2 + BX + C = 0 : ");
        System.out.println("Знайдемо дискрімінант D = b^2 - 4ac");
        int D = b1*b1 - 4 * a1 * c1;
        System.out.println("D = " + D);
        if (D < 0){
            System.out.println("Рівняння не має коренів");
            System.out.println("END");
        } else if (D > 0) {
            System.out.println("Рівняння має 2 корені Х1 та Х2");
            int x1 = (int) ((-b1 + Math.sqrt(D) ) / (2 * a1));
            int x2 = (int) ((-b1 - Math.sqrt(D) ) / (2 * a1));
            System.out.println("Корні рівняння X1 = " +x1+ " X2 = "+x2);
        } else {
            System.out.println("Рівняння має лише один корінь Х1");
            int x3 = (int) ((-b1 + Math.sqrt(D) ) / (2 * a1));
            System.out.println("Корінь рівняння Х = "+x3);
        }
    }
}