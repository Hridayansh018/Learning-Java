import java.util.ArrayList;
import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        String[] cars = {"volvo", "BMW"};
        // cars = {"volvo", "BMW"};
        System.out.println(Arrays.toString(cars));

        String[] name;
        name = new String[]{"aman","akarsh"};
        System.out.println(Arrays.toString(name));

        cars[0] = "Mahindra";
        // cars[2] = "TATA";
        System.out.println(cars[0]);
        System.out.println(Arrays.toString(cars));

        String[] car = new String[3];
        car[0] = "c1";
        car[1] = "c2";
        car[2] = "c3";

        System.out.println(Arrays.toString(car));

        // Loop through an array
        Number[] number = {1,2,3,4,5,6,7,8,9};
        String stars = "";
        for (int i = 0; i<number.length; i++) {
            // System.out.println("*".repeat(i));
            stars += "*";
            System.out.println(stars);
        }

        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][1]);

        int key = 3;

        int foundnum = Arrays.binarySearch(number, key);
        System.out.println(foundnum);

        int multiplier = 1;
        
        while (multiplier <= 10) {
            System.out.println("Hello World");
            multiplier++;
        }
        int i = 0; 
        while (i<=10){
            System.out.println("World");
            i++;
        }

        ArrayList<Integer> numm = new ArrayList<Integer>();
        numm.add(1);
        numm.add(2);
        numm.add(3);

        System.out.println(numm.toString());
        System.out.println(numm.get(1));
        numm.remove(0);
        System.out.println(numm.toString());
        numm.clear();
        System.out.println(numm.toString());
    }
}
