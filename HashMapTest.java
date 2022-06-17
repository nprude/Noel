import java.util.Scanner;
import java.util.HashMap;

public class HashMapTest {
    String response;
    HashMap<String, String> myHash= new HashMap<String, String>();

    Scanner scan = new Scanner(System.in);

    public void getFlowers() {
        System.out.println("Please enter a flower:");
        String flowers = scan.next();
        System.out.println("Please enter the flower's description:");
        String flowerdescription = scan.next();
        myHash.put(flowers, flowerdescription);
        System.out.println("The following have been added to the database: " + myHash);
        continuePrompt();
    }//end setFlowers
    public void continuePrompt(){
        System.out.println("Would you like to continue adding to the database? Y or N");
        response = scan.next();
        System.out.println(response);
        if (response.equalsIgnoreCase("Y")) {
            getFlowers();
        } else if (response.equalsIgnoreCase("N")) {
            sendMessage();

        } else {
            invalidResponse(response);
        }
    }

    public void sendMessage(){
        System.out.println("Thanks for the update!");
    }
    public void invalidResponse(String response){
        System.out.println("You entered " + response +". Please enter a valid response.");
        continuePrompt();
    }
    public static void main(String[] args){
        HashMapTest test = new HashMapTest();
        test.getFlowers();
    }
}