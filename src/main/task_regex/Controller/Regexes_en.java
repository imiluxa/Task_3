package Controller;

public class Regexes_en extends Regexes{

    // Latin name
    public String getRegexFirstName() {
        return "^[A-Z][a-z]{1,20}$";
    }
    // login
    public String getRegexLogin() {
        return "^[A-Za-z0-9_-]{8,20}$";
    }

}
