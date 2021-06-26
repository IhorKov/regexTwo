import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexTwo {
    public static void main(String[] args) {
        String mail = "apasniy1234@gmail.com";
        String mailError = "afdasf";

        printMail(mail);
        printMail(mailError);
    }

    public static void printMail(String str){

        String result;
        String regex = "@.*\\..*";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);

        if(matcher.find()){
            result = matcher.group();
            System.out.println(result);
        }
        else {
            System.out.println("!совпадений не найдено!");
        }
    }
}
