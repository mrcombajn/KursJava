package org.example.factoryExamples.button;

public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("Html Button has been created.");
    }

    @Override
    public void onClick() {
        System.out.println("Html Button has been onclicked.");
    }
}
