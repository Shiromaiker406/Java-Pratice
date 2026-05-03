import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class praktis{

    public static void main(String[] args){

        String mj = "\\w\\w\\w\\w\\w\\w\\w\\w\\w\\s\\d\\d\\d\\d";
        String hd = "hollidays 2024";

        Pattern pat = Pattern.compile(mj);
        Matcher mat = pat.matcher(hd);

        boolean result = mat.matches();

        System.out.println(result);

    }
}
