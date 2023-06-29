package org.example.button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows Button has been rendered.");
    }

    @Override
    public void onClick() {
        System.out.println("Windows Button has been onclicked.");
    }
}
