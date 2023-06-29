package org.example.dialogs;

import org.example.button.Button;
import org.example.button.HtmlButton;

public class WebDialog extends Dialog {

    @Override
    Button createButton() {
        return new HtmlButton();
    }
}
