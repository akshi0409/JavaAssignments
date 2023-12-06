import java.util.regex.Pattern;
class InvalidDetailsException extends Exception
{
    public InvalidDetailsException(String str)
    {
        super(str);
    }
}
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
        try
        {
            boolean result = user.matchName("Akshita");
            if(!result)
                throw new InvalidDetailsException("Invalid name");
            System.out.println(result);
        }
        catch (InvalidDetailsException e)
        {
            System.out.println("Exception Caught : "+e.getMessage());
        }

        try{
            boolean result = user.matchName("Ak");
            if(!result)
                throw new InvalidDetailsException("Invalid name");
            else
                System.out.println(result);
        }
        catch (InvalidDetailsException e)
        {
            System.out.println("Exception Caught : " + e.getMessage());
        }
        try{
            boolean result = user.matchMail("abcxyz@bl.co.co.in");
            if(!result)
                throw new InvalidDetailsException("Invalid mail");
            System.out.println(result);
        }
        catch (InvalidDetailsException e)
        {
            System.out.println("Exception Caught : "+e.getMessage());
        }
        try{
            boolean result = user.matchNumber("09046371890");
            if(!result)
                throw new InvalidDetailsException("Invalid number");
            System.out.println(result);
        }
        catch (InvalidDetailsException e)
        {
            System.out.println("Exception Caught : "+e.getMessage());
        }
        try{
            boolean result = user.matchPassword("wUf@9fabcdeeee");
            if(!result)
                throw new InvalidDetailsException("Invalid password");
            System.out.println(result);
        }
        catch (InvalidDetailsException e)
        {
            System.out.println("Exception Caught : "+e.getMessage());
        }
    }
}
