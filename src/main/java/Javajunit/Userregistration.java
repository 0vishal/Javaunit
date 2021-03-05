package Javajunit;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Userregistration {

        public static boolean Validlastname(String name) {
            Pattern p = Pattern.compile("^[A-Z][a-z]{3,}$");
            Matcher m = p.matcher(name);
            return m.find();
        }

        public static boolean Validfirstname(String name) {
            Pattern p = Pattern.compile("^[A-Z][a-z]{3,}$");
            Matcher m = p.matcher(name);
            return m.find();

        }
        public static boolean Validemail(String name) {
        String regex = "^(.+)@(.+)$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        return m.find();
        }
        public static boolean Validphoneno(String name) {
        String regex = "^[0-9]+\\s[0-9]{10}$";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(name);
        return m.find();
       }
}
