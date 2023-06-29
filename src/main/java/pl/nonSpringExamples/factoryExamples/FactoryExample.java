package pl.nonSpringExamples.factoryExamples;

import pl.nonSpringExamples.factoryExamples.dialogs.Dialog;
import pl.nonSpringExamples.factoryExamples.dialogs.WebDialog;
import pl.nonSpringExamples.factoryExamples.dialogs.WindowsDialog;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class FactoryExample {

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