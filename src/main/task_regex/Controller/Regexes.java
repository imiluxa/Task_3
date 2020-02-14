package Controller;

public class Regexes {

    // Latin First name
    public String getRegexFirstName() {
        return "^[A-Z][a-z]{1,20}$";
    }
    // Latin Last name
    public String getRegexLastName() {
        return "^[A-Z][a-z]{1,15}$";
    }
    // Latin patronymic name
    public String getRegexPatronymicName() {
        return "^[A-Z][a-z]{1,15}$";
    }

    // login
    public String getRegexLogin() {
        return "^[A-Za-z0-9_-]{8,20}$";
    }

}
