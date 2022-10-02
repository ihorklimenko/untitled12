package Loop;

public class LoopExamplesTask {
    public static void main(String[] args) {
        // For
        for (int i = 0; i < 5 ; i++) { //i + 1
            System.out.print(i);
        }
        System.out.println();
        for (int i = 0; i < 5; i = i + 2) { // i + 2
            System.out.print(i);
        }
        // For-Each
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.print(i);
        }
        // Java Break
        for (int i = 0; i < 10 ; i++) { //stop on 4(3)
            if (i == 4){
                break;
            }
            System.out.print(i);
        }
        // Java Continue
        for (int i = 0; i < 10 ; i++) { //continue after 4
            if (i == 4){
                continue;
            }
            System.out.print(i);
        }
        // Break and Continue in While Loop
        // Break
        int i = 0;
        while (i < 10){
            System.out.print(i);
            i++;
            if (i==4){
                break;
            }
        }
        // Continue
        int a = 0;
        while (a<10){
            if (a == 4){
                a++;
                continue;
            }
            System.out.print(a);
            a++;
        }
    }
}

