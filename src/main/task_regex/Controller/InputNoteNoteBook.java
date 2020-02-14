package Controller;
import View.View;

import java.util.Scanner;

//import static Controller.Regexes.*;
import static View.TextConstant.FIRST_NAME;
import static View.TextConstant.LOGIN_DATA;

public class InputNoteNoteBook {

    private View view;
    private Scanner sc;

    private String firstName;
    private String lastName;
    private String patronymic;
    private String fullName;
    private String login;
    private String comment;
    //enum
    private String phoneHome;
    private String phoneMobileFirst;
    private String phoneMobileSecond;
    private String email;
    private String skypeName;
    private String index;
    private String city;
    private String street;
    private String homeNumber;
    private String apartmentNumber;
    private String fullAddress;

    public InputNoteNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {
        UtilController utilityController =
                new UtilController(sc, view);
        Regexes regex;
        if (String.valueOf(View.bundle.getLocale()).equals("ua")) {
            regex = new Regexes_ua();
        }
        else {
            regex = new Regexes_en();
        }

        //String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
        //        ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        this.firstName =
                utilityController.inputStringValueWithScanner
                        (FIRST_NAME, regex.getRegexFirstName());
        this.lastName =
                utilityController.inputStringValueWithScanner
                        (FIRST_NAME, regex.getRegexFirstName());

        this.login =
                utilityController.inputStringValueWithScanner
                        (LOGIN_DATA, regex.getRegexLogin());
    }

}
