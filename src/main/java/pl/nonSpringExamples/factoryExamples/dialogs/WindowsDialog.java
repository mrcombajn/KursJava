package pl.nonSpringExamples.factoryExamples.dialogs;


import pl.nonSpringExamples.factoryExamples.button.Button;
import pl.nonSpringExamples.factoryExamples.button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
