package Javajunit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {




        @Test
        public void firstnametruetest() {
            Userregistration user = new Userregistration();
            boolean result = user.Validfirstname("Monkey");
            Assertions.assertTrue(result);

        }
        @Test
        public void firstnamefalsetest() {
            Userregistration user = new Userregistration();
            boolean result = user.Validfirstname("mon");
            Assertions.assertFalse(result);
        }
}
