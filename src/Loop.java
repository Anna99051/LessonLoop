import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

//
//        int counter = 0;
//        for (int i = 59; i < 1005; i++) {
//
//            System.out.println("This is iteration # " + counter);
//            counter++;

//

//                int [][] my2DArray = {{1, 2, 4, 7},{11, 12, 13,14}, {22, 23, 24,5}};
//                System.out.println("This is an element of row index=2 and column =3: " + my2DArray[2][3]);


        int[][] my2DArray = {{125, 55, 77}, {91, 5, 19}, {90, 211, 21}};

        System.out.println("This is an element of row index=0 and column=0: " + my2DArray[0][0]);
        System.out.println("This is an element of row index=0 and column=1: " + my2DArray[0][1]);
        System.out.println("This is an element of row index=0 and column=2: " + my2DArray[0][2]);

        System.out.println("");

        System.out.println("This is an element of row index=1 and column=0: " + my2DArray[1][0]);
        System.out.println("This is an element of row index=1 and column=1: " + my2DArray[1][1]);
        System.out.println("This is an element of row index=1 and column=2: " + my2DArray[1][2]);

        System.out.println("");

        System.out.println("This is an element of row index=2 and column=0: " + my2DArray[2][0]);
        System.out.println("This is an element of row index=2 and column=1: " + my2DArray[2][1]);
        System.out.println("This is an element of row index=2 and column=2: " + my2DArray[2][2]);

        System.out.println();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Indexes: i - " + i + "; j - " + j + "; value = " + my2DArray[i][j]);
            }
            System.out.println();
        }

        int[] forLoopArray = {5, 6, 7, 1, 1};

        for (int internalValue : forLoopArray) {
            System.out.println("For loop element: " + internalValue);
        }

        int[][] complex2DArray = {{5, 6}, {7, 8}};

        for (int[] singleRow : complex2DArray) {
            for (int singleElement : singleRow) {
                System.out.println("Just a single element from 2D array " + singleElement);
            }
        }

        System.out.println();

        //WHILE LOOP EXAMPLE

        int clockTime = 0;

        while (clockTime <= 24) {
            System.out.println("The time is " + clockTime + " o'clock");
            //clockTime++;
            clockTime += 3;
        }

        System.out.println();

        boolean runWhileLoop = true;

        while (runWhileLoop) {
            System.out.println("variable runWhite Loop is still set to true. Therefore I am running");

            if (clockTime > 100) {
                runWhileLoop = false;
            }

            clockTime++;

        }

        int menuItem = 99;
        System.out.println("Please select an action you want to do:");
        System.out.println("1 - write that you are smart");
        System.out.println("2 - write that you are pretty");
        System.out.println("3 - write that you are the best");
        System.out.println("0 - Exit the application (but you are still the best)");

        Scanner scanner = new Scanner(System.in);

        while (menuItem != 0) {

            menuItem = scanner.nextInt();

            if (menuItem == 1) {
                System.out.println("You are smart!");
            } else if (menuItem == 2) {
                System.out.println("You are pretty!");
            } else if (menuItem == 3) {
                System.out.println("You are the best!");
            } else {
                System.out.println("There is no such option!");
            }

        }

        int initialValue = 10;

        //WIll not run at all!
        while (initialValue < 5) {
            System.out.println("WHILE LOOP INITIAL VALUE < 5");
        }

        //WILL run once!
        do {
            System.out.println("DO WHILE LOOP INITIAL VALUE < 5");
        } while (initialValue < 5);


    }


}





