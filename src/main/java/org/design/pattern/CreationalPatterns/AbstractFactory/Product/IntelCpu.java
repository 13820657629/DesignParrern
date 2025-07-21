package org.design.pattern.CreationalPatterns.AbstractFactory.Product;

/**
 * @author weishitong
 * @date 2025/7/21 10:04
 */
public class IntelCpu implements Cpu {
    @Override
    public void run() {
        System.out.println("Intel CPU 正在运行");
    }
}
