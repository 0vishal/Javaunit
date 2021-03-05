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
}
