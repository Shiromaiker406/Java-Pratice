import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class praktis2 {
    public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);000000000000000000000000000000000000000.
 
        // Prompt user for input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
 
        // Compile regex pattern with case insensitivity
        Pattern pattern = Pattern.compile("NUMOA", Pattern.CASE_INSENSITIVE);
        Pattern pattern2 = Pattern.compile("NUMANILA", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(userInput);
        Matcher matcher2 = pattern2.matcher(userInput);
 
        // Check if match is found
        if (matcher.find()) {
            System.out.println("Welcome to NU MOA.");
        } else if (matcher2.find()) {
            System.out.println("Welcome to NU MANILA.");
        
        } else {
            System.out.println("Match not found");
        }
 
        scanner.close(); // Close scanner
    }
}