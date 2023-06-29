package org.example.factoryExamples.dialogs;


import org.example.factoryExamples.button.Button;
import org.example.factoryExamples.button.HtmlButton;


public class WebDialog extends Dialog {

    @Override
    Button createButton() {
        return new HtmlButton();
    }
}
