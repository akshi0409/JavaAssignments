import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizedTest{
    @Parameterized.Parameters
    public static Collection<Object[]> mailList() {
        return Arrays.asList(new Object[][] {
                { "abc.xyz@gmail", false }, { "abc.xyz@gmail.com", true }, { "abc.xyz@gmail@com", false },{ "abc.aaaa04@gmail.com", true },{ "abc.xyz@gmail.com.in", true },{ "abc.xyz@gmail.com.com", false }
        });
    }

    private String mail;

    private boolean val;

    public ParameterizedTest(String mail, boolean val) {
        this.mail = mail;
        this.val = val;
    }

    @Test
    public void test() {
        UserRegistration user = new UserRegistration();
        Assert.assertEquals(val, user.matchMail(mail));
    }
}

