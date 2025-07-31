package org.design.pattern.StructuralPatterns.Decorator;

import java.util.Base64;

/**
 * @author weishitong
 * @date 2025/7/31 10:41
 */
public class EncryptPrinter extends PrinterDecorator {
    public EncryptPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        String encrypted = Base64.getEncoder().encodeToString(message.getBytes());
        printer.print(encrypted);
    }
}
