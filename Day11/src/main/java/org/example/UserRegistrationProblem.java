package org.example;

import java.util.regex.Pattern;

public class UserRegistrationProblem {
    public boolean matchName(String firstName) {
        return (Pattern.matches("^[A-Z][a-z].{3,}$", firstName));
    }
    public boolean matchMail(String firstName){
        return (Pattern.matches("^[A-Za-z0-9]+"+"([._]+[A-za-z0-9]+)*"+"@"+"[A-Za-z0-9]+"+"."+"([A-za-z0-9]+[.])*"+"[A-Za-z0-9]*",firstName));
    }
    public boolean matchNumber(String number)
    {
        return (Pattern.matches("^[0-9]{1,2}\\s[1-9][0-9]{9}",number));
    }
    public static void main(String[] args) {
        UserRegistrationProblem user = new UserRegistrationProblem();
        System.out.println(user.matchName("Akshita"));
        System.out.println(user.matchName("Ak"));
        System.out.println(user.matchMail("abcxyz@bl.co.co.in"));
        System.out.println(user.matchNumber("09046371890"));
    }
}