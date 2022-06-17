import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class UserInput {
 //Test: Get list of numbers from user, store numbers in array, add all numbers

    int[] arrayofnums;
    int a, b, sum;

    Scanner myscanner = new Scanner(System.in);
    public void getInfo() {

        System.out.println("Please enter a number");
        a = Integer.parseInt(myscanner.next());
        System.out.println("Please enter another number");
        b = Integer.parseInt(myscanner.next());
        addNumbers(a,b);
    }


    public void addNumbers(int a, int b) {
        sum = a + b;
        System.out.println("The sum of " + a + " + " + b + " is "+ sum);
    }



    public static void main(String[] args) {
        UserInput ui = new UserInput();
        ui.getInfo();

    }

}
