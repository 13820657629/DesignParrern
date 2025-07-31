package org.design.pattern.StructuralPatterns.Decorator;

/**
 * @author weishitong
 * @date 2025/7/31 10:18
 */
public class SimplePrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
