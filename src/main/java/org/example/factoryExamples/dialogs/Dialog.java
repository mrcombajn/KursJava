package org.example.factoryExamples.dialogs;

import org.example.factoryExamples.button.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();

        okButton.render();
        okButton.onClick();
    }

    abstract Button createButton();

}
