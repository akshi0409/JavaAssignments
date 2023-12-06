import org.example.UserRegistrationProblem;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class UserMultipleMails{
    @Parameterized.Parameters
    public static Collection<Object[]> mailList() {
        return Arrays.asList(new Object[][] {
                { "akshita.asah@gmail", false }, { "akshita.asah@gmail.com", true }, { "akshita.asah@gmail@com", false },{ "akshita.asah04@gmail.com", true },{ "akshita.asah@gmail.com.in", true },{ "akshita.asah@gmail.com.com", false }
        });
    }

    private String mail;

    private boolean val;

    public UserMultipleMails(String mail, boolean val) {
        this.mail = mail;
        this.val = val;
    }

    @Test
    public void test() {
        UserRegistrationProblem user = new UserRegistrationProblem();
        Assert.assertEquals(val, user.matchMail(mail));
    }
}
