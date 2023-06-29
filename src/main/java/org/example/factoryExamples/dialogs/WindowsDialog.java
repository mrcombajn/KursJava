package org.example.factoryExamples.dialogs;


import org.example.factoryExamples.button.Button;
import org.example.factoryExamples.button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
