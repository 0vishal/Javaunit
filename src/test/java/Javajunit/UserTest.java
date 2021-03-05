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
}
