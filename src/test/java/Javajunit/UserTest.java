package Javajunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {




        @Test
        public void firstnametruetest() {
            Userregistration user = new Userregistration();
            boolean result = user.Validfirstname("Vishal");
            Assertions.assertTrue(result);

        }
        @Test
        public void firstnamefalsetest() {
            Userregistration user = new Userregistration();
            boolean result = user.Validfirstname("mon");
            Assertions.assertFalse(result);
        }
        @Test
        public void lastnametruetest() {
        Userregistration user = new Userregistration();
        boolean result = user.Validlastname("Salaskar");
        Assertions.assertTrue(result);

        }
        @Test
        public void lastnamefalsetest() {
        Userregistration user = new Userregistration();
        boolean result = user.Validlastname("Ken");
        Assertions.assertFalse(result);

        }
        @Test
        public void emailtruetest() {
        Userregistration user = new Userregistration();
        boolean result = user.Validemail("vishal@gmail.com");
        Assertions.assertTrue(result);

        }
        @Test
        public void emailfalsetest() {
        Userregistration user = new Userregistration();
        boolean result = user.Validemail("rahul.com");
        Assertions.assertFalse(result);

        }
        @Test
        public void phonenotruetest() {
                Userregistration user = new Userregistration();
                boolean result = user.Validphoneno("91 9167965231");
                Assertions.assertTrue(result);

        }
        @Test
        public void phonenofalsetest() {
                Userregistration user = new Userregistration();
                boolean result = user.Validphoneno("909123454337834");
                Assertions.assertFalse(result);

        }
}
