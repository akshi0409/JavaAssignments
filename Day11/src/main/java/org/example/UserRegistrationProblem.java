package org.example;

import java.util.regex.Pattern;

public class UserRegistrationProblem {
    public boolean matchName(String firstName) {
        return (Pattern.matches("^[A-Z][a-z].{3,}$", firstName));
    }
    public static void main(String[] args) {
        UserRegistrationProblem user = new UserRegistrationProblem();
        System.out.println(user.matchName("Akshita"));
    }
}