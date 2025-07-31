package org.design.pattern.StructuralPatterns.Decorator;

/**
 * @author weishitong
 * @date 2025/7/31 10:41
 */
public class Main {
    public static void main(String[] args) {
        Printer printer = new SimplePrinter(); // 原始打印
        printer = new TimestampPrinter(printer); // 加时间戳
        printer = new UsernamePrinter(printer, "Alice"); // 加用户名
        printer = new EncryptPrinter(printer); // 加密

        printer.print("Hello, World!");
    }
}
