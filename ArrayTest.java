import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest
{


    public static void main(String[] args)
    {

        Scanner scan = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<String>();

        a.add("Jasmine");
        a.add("Gardenia");

        System.out.println("Please enter the name of a Flower");
        String flowers = scan.next();
        a.add(flowers);

        int f1[ ] = {1,5,1,9,10,6,8,4,2,77};
        int f2[] = f1;

        for(int i=0; i<=9;i++){
            System.out.println(f2[i]);
        }
        for(int i=0; i< a.size(); i++) {
            System.out.println(a.get(i));
        }
        System.out.print("Size of ArrayList a is " + a.size());
    }
}

