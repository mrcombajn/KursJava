package org.example.dialogs;

import org.example.button.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();

        okButton.render();
        okButton.onClick();
    }

    abstract Button createButton();

}
