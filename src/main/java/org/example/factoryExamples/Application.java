package org.example;

import org.example.dialogs.Dialog;
import org.example.dialogs.WebDialog;
import org.example.dialogs.WindowsDialog;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Application {

    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    private static void configure() {
        String osInfo = getOsInformation();

        switch (osInfo) {
            case "Windows 10":
                dialog = new WindowsDialog();
                break;
            default:
                dialog = new WebDialog();
        }
    }

    private static void runBusinessLogic() {
        dialog.renderWindow();
    }

    private static String getOsInformation() {
        return System.getProperty("os.name");
    }

}