import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

class composition {
    String termName;
    public composition(String termName){ 
        this.termName = termName;
    
        
    }
}

      public class term{
      public static void main(String[] args){

        ArrayList<String> term1Subjects = new ArrayList<String>();
        term1Subjects.add("Fundamentals of Programming");
        term1Subjects.add("Introduction to Computing");
        term1Subjects.add("Purposive Communication");
        term1Subjects.add("Science, Technology and Society");
        term1Subjects.add("Understanding the Self");

        ArrayList<String> term2Subjects = new ArrayList<String>();
        term2Subjects.add("Intermidiate Programming");
        term2Subjects.add("Hardware and Software");
        term2Subjects.add("Mathematics n the Modern World");
        term2Subjects.add("Art Appriciation");
        term2Subjects.add("NSTP");

        ArrayList<String> term3Subjects = new ArrayList<String>();
        term1Subjects.add("PE 3");
        term1Subjects.add("Nationalian Course");
        term1Subjects.add("Discrete Mathematics");
        term1Subjects.add("Art Appriciation");
        term1Subjects.add("Ethics");


        Scanner skan = new Scanner(System.in);
        System.out.println("Welcome to National University Portal ");
       
       
            ArrayList<composition> listofname = new ArrayList<composition>();
            System.out.print("Enter Full Name : ");
            String name = skan.nextLine();
            composition n = new composition(name);
            term2Subjects.addAll((Collection<? extends String>) n);
    
            ArrayList<composition> listofprogram = new ArrayList<composition>();
            System.out.print("Enter Program : ");
            String prog = skan.nextLine();
            composition p = new composition(prog);
            listofname.add(p);


            ArrayList<composition> listofyear = new ArrayList<composition>();
            System.out.print("Enter Year  : ");
            String year = skan.nextLine();
            composition y = new composition(year);
            listofname.add(y);
    
        
            ArrayList<composition> listofterm = new ArrayList<composition>();
            System.out.print("Enter Term (1, 2, 3): ");
            String term = skan.nextLine();
            composition t = new composition(term);
            listofname.add(t);

            System.out.println("\nThank  you " + name.substring(0, 12 ) + "," + " " + "Where available subjects for term" + " " + term + " " + "are:");

            switch (term){
                case "1":
                    for (String subject : term1Subjects){
                        System.out.println("- " + subject);
                    }
                    break;
                case "2":
                    for (String subject : term2Subjects){
                        System.out.println("- " + subject);
                    }    
                    break;
                case "3":
                    for (String subject : term3Subjects){
                        System.out.println("- " + subject);
                    }    
                    break;   
                default:
                    System.out.println("Invalid term entered.");
                    break;        
        }
        skan.close();
    }
}
// Hello po kung sino ka man mali pong OneDrive ang sinave nuo po 
// Hindi ko ata na log out ang OneDrive ko sa comlab kaya dito napunta yung files mo 
// Palipat nalang po nag files rest assure wala po ako ginalaw sa code nuo po.
    