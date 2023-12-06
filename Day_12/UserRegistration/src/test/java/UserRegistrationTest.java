import org.junit.*;
import org.junit.Test;
public class UserRegistrationTest {
    @Test
    public void firstNameTest()
    {
        UserRegistration firstName = new UserRegistration();
        Assert.assertTrue("The name is valid",firstName.matchName("Akshita"));
        Assert.assertFalse("The name is valid",firstName.matchName("akshita"));
        Assert.assertFalse("The name is valid",firstName.matchName("Ak"));
        Assert.assertFalse("The name is valid",firstName.matchName("Akshita4"));
    }
    @Test
    public void lastNameTest()
    {
        UserRegistration lastName = new UserRegistration();
        Assert.assertTrue("The name is valid",lastName.matchName("Sah"));
        Assert.assertFalse("The name is valid",lastName.matchName("Sa4"));
        Assert.assertFalse("The name is valid",lastName.matchName("sah"));
    }
    @Test
    public void MailTest()
    {
        UserRegistration mail = new UserRegistration();
        Assert.assertTrue("The name is valid",mail.matchMail("akshita.asah@gmail.com"));
        Assert.assertFalse("The name is valid",mail.matchMail("akshita.asah@gmail.com.com"));
        Assert.assertFalse("The name is valid",mail.matchMail("akshita.asah.asah@gmail.com.in"));
    }
    @Test
    public void MobileTest()
    {
        UserRegistration number = new UserRegistration();
        Assert.assertTrue("The name is valid",number.matchNumber("91 9876543210"));
        Assert.assertFalse("The name is valid",number.matchNumber("+91 9876543210"));
        Assert.assertFalse("The name is valid",number.matchNumber("919876543210"));
    }
    @Test
    public void passwordTest()
    {
        UserRegistration password = new UserRegistration();
        Assert.assertTrue("The name is valid",password.matchPassword("w9E3+4q5u"));
        Assert.assertFalse("The name is valid",password.matchPassword("w9E34q5u"));
        Assert.assertFalse("The name is valid",password.matchPassword("w9E3+4"));
    }

}

