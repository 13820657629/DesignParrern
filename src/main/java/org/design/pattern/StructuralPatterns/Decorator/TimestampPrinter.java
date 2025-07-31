package org.design.pattern.StructuralPatterns.Decorator;

import java.time.LocalDateTime;

/**
 * @author weishitong
 * @date 2025/7/31 10:39
 */
public class TimestampPrinter extends PrinterDecorator {

    public TimestampPrinter(Printer printer) {
        super(printer);
    }

    @Override
    public void print(String message) {
        String newMsg = "[" + LocalDateTime.now() + "] " + message;
        printer.print(newMsg);
    }
}
