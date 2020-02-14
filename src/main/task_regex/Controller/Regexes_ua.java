package Controller;

public class Regexes_ua extends Regexes{

    // Cyrillic name
    public String getRegexFirstName() {
        return "^[А-ЩЬЮЯҐІЇЄ][а-щьюяґіїє']{1,20}$";
    }
    // login
    public String getRegexLogin() {
        return "^[A-Za-z0-9_-]{8,20}$";
    }

}
