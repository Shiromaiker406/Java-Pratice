import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Practice1 {
    
    public static void main (String []args) {
        String re = "\\w\\w\\w\\w\\w\\w\\w\\w\\s\\w\\w\\w\\w";
        String val = "Holidays 2024";

        Pattern bruhh = Pattern.compile(re);
        Matcher huhh = bruhh.matcher(val);
   
        boolean result = huhh.matches();
        System.out.println(result);

    }
}
