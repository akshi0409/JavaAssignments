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
                { "ayz.abc@gmail", false }, { "xyz.abc@gmail.com", true }, { "xyz.abc@gmail@com", false },{ "xyz.abc04@gmail.com", true },{ "xyz.abc@gmail.com.in", true },{ "xyz.abc@gmail.com.com", false }
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
