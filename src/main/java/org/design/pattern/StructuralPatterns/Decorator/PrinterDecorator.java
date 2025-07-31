package org.design.pattern.StructuralPatterns.Decorator;

/**
 * @author weishitong
 * @date 2025/7/31 10:38
 */
public abstract class PrinterDecorator implements Printer {

    protected Printer printer;

    public PrinterDecorator(Printer printer) {
        this.printer = printer;
    }

    @Override
    public abstract void print(String message);
}
