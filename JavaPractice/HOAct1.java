import java.util.Scanner;
import java.util.Arrays;
public class HOAct1 {
public static void main(String []args) {

    Scanner sc = new Scanner(System.in);
    // ArrayList<String> day = new ArrayList<String>();
    int[] a=new int[3];
    a[0] = 04;
    a[1] = 06;
    a[2] = 2006;
    int[] b=new int[3];
    b[0] = 13;
    b[1] = 24;
    b[2] = 2030;

    String [] c=new String[4];
    c[0] = ("Mark Kenneth ");
    c[1] = ("F. ");
    c[2] = ("Ricaborda ");

    String fname = ("Mark Kenneth");
    String mname = ("F");
    String lname = ("Ricaborda");

    
    
    System.out.println("Welcome to Flight 101");
    System.out.println("Please Provide your Information below");
    System.out.println("Full name: ");
    String name = sc.nextLine();
    System.out.println("Enter your Birthday: ");
    int bday = sc.nextInt();
    System.out.println("Enter your Age: ");
    int age = sc.nextInt();
    System.out.println("Date of Flight: ");
    System.out.println("Total passenger/5: ");
    int pass = sc.nextInt();

    System.out.println("Please check the information below if it is correct, if yes, kindly proceed to checkout");
    
    System.out.println("First Name: " + fname.substring(0,12));
    System.out.println("Middle Initial: " + mname.substring(0,1));
    System.out.println("Last Name: " + lname.substring(0,9));
    System.out.println("Birthday: " + bday);
    System.out.println("Age: " + age);
    System.out.println("Date of Flight: " +Arrays.toString(b));
    System.out.println("Total Passenger/5: " + pass);

    double x = pass * 2345.10;



    System.out.println("Thank you" + " " +(fname)+ " " +(mname)+" " + (lname) + " " + "for choosing flight 101." +" your total amount to pay for is " + " " + (x) + " " + (pass) + " "  
     + " is" + (pass) + " please present this to cashier for payment. have a safe flight! ");
    

    }
}