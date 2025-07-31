package org.design.pattern.StructuralPatterns.Decorator;

/**
 * @author weishitong
 * @date 2025/7/31 10:40
 */
public class UsernamePrinter extends PrinterDecorator {

    private String username;

    public UsernamePrinter(Printer printer, String username) {
        super(printer);
        this.username = username;
    }

    @Override
    public void print(String message) {
        String newMsg = "[" + username + "] " + message;
        printer.print(newMsg);
    }
}
