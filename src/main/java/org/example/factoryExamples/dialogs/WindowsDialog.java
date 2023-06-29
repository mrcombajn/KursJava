package org.example.dialogs;

import org.example.button.Button;
import org.example.button.WindowsButton;

public class WindowsDialog extends Dialog {

    @Override
    Button createButton() {
        return new WindowsButton();
    }
}
