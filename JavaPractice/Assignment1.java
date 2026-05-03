import java.util.ArrayList;
import java.util.Scanner;

class White {
    public String subject;
    public String program;

    White (String subject, String program) {
        this.subject = subject;
        this.program = program;
    }
}

public class Assignment1 {

    public static void main (String []args) {

        ArrayList <String> courseList = new ArrayList<String>();
        courseList.add("Fundamentals of Programming");
        courseList.add("Introduction to Computing");
        courseList.add("Purposive Communication");
        courseList.add("Science, Technology and Society");
        courseList.add("Understanding the Self");

        ArrayList <String> whiteList = new ArrayList<String>();
        whiteList.add("Intermediate Programming");
        whiteList.add("Hardware and Software");
        whiteList.add("Mathematics in the Modern World");
        whiteList.add("Art Appreciation");
        whiteList.add("NSTP");

        ArrayList <String> blackList = new ArrayList<String>();
        blackList.add("Object Oriented Programming");
        blackList.add("PathFit 3");
        blackList.add("Nationalian Course");
        blackList.add("Discrete Mathematics");
        blackList.add("Ethics");

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to National University Portal");
        System.out.print("Enter Full Name: ");
        String name = input.nextLine();
        System.out.print("Enter Program/Course: ");
        String course = input.nextLine();
        System.out.print("Enter Year: ");
        int year = input.nextInt();
        System.out.print("Enter Term: ");
        int term = input.nextInt();
        System.out.println("Thank you"+" "+(name.substring(0, 12))+" "+"the available subject for term"+" "+term+" "+"are:");

        switch (term) {
            case 1 -> {
                White w1 = new White("Where available subject", " for term 1 are:");
                System.out.println(w1.subject + w1.program);
                for (String Nexus : courseList) {
                    System.out.println(Nexus + " ");
                }
                break;
            }
            case 2 -> {
                White w2 = new White("Where available subject", " for term 2 are:");
                System.out.println(w2.subject + w2.program);
                for (String Zenith : whiteList) {
                    System.out.println(Zenith + " ");
                }
                break;
            }
            case 3 -> {
                White w3 = new White("Where available subject", " for term 3 are:");
                System.out.println(w3.subject + w3.program);
                for (String Lucifer : blackList) {
                    System.out.println(Lucifer + " ");
                }
                break;
            }
            default -> System.out.println("Not Available!");     
        }
        
    }
}
