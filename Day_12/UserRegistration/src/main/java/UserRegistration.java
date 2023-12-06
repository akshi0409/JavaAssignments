import java.util.regex.Pattern;

public class UserRegistration {
    public boolean matchName(String name) {
        return (Pattern.matches("^[A-Z][a-z]{2,}$", name));
    }
    public boolean matchMail(String mail){
        return (Pattern.matches("^[A-Za-z0-9]+"+"([+._-][A-za-z0-9]+)?"+"@[A-Za-z0-9]+"+"[.]([A-za-z0-9])+"+"([.][A-Za-z0-9]{0,2})?",mail));
    }
    public boolean matchNumber(String number)
    {
        return (Pattern.matches("^[0-9]{1,2}\\s[1-9][0-9]{9}",number));
    }
    public boolean matchPassword(String password){
        return (Pattern.matches("^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$",password));
    }
    public static void main(String[] args) {
        UserRegistration user = new UserRegistration();
        System.out.println(user.matchName("Akshita"));
        System.out.println(user.matchName("Aks"));
        System.out.println(user.matchMail("abcxyz@bl.co.co.in"));
        System.out.println(user.matchNumber("09046371890"));
        System.out.println(user.matchPassword("wUf@9fabcdeeee"));
    }
}