package Controller;
import View.View;

import java.util.Scanner;

import static Controller.Regexes.*;
import static View.TextConstant.FIRST_NAME;
import static View.TextConstant.LOGIN_DATA;

public class InputNoteNoteBook {

    private View view;
    private Scanner sc;

    private String firstName;
    private String login;

    public InputNoteNoteBook(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }

    public void inputNote() {
        UtilController utilityController =
                new UtilController(sc, view);
        String str = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME_LAT;

        this.firstName =
                utilityController.inputStringValueWithScanner
                        (FIRST_NAME, str);
        this.login =
                utilityController.inputStringValueWithScanner
                        (LOGIN_DATA, REGEX_LOGIN);
    }

}
