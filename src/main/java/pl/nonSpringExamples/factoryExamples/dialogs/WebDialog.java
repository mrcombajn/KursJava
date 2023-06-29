package pl.nonSpringExamples.factoryExamples.dialogs;


import pl.nonSpringExamples.factoryExamples.button.Button;
import pl.nonSpringExamples.factoryExamples.button.HtmlButton;


public class WebDialog extends Dialog {

    @Override
    Button createButton() {
        return new HtmlButton();
    }
}
