package pl.nonSpringExamples.factoryExamples.dialogs;

import pl.nonSpringExamples.factoryExamples.button.Button;

public abstract class Dialog {

    public void renderWindow() {
        Button okButton = createButton();

        okButton.render();
        okButton.onClick();
    }

    abstract Button createButton();

}
