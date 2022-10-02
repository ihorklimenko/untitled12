package Arrays;

public class MassExamplesTask {
    public static void main(String[] args){
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]); // print volvo
        System.out.println(cars[1]); // print bmw
        System.out.println(cars[2]); // print ford
        System.out.println(cars[3]); // print mazda

        cars[0] = "Opel"; // rename VOLVO to OPEL
        System.out.println(cars[0]);

        System.out.println(cars.length); // length arrays 4

        //Loop through an array
        for (int i = 0; i < cars.length ; i++) {
            System.out.println(cars[i]);
        }
        System.out.println();
        //Loop through an Array with For-Each
        for (String i : cars){
            System.out.println(i);
        }
        System.out.println();
        //Multidimensional Arrays
        int[] [] myNumbers = {{1, 2, 3, 4},{5, 6, 7}};
        int x = myNumbers[1][2]; // third element [2] in second array [1]
        System.out.println(x);   //print 7

        for (int i = 0; i < myNumbers.length; i++){
            for (int j = 0; j < myNumbers.length; j++){
                System.out.println(myNumbers[i][j]);
            }
        }

    }
}
