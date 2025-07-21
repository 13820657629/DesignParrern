package org.design.pattern.CreationalPatterns.AbstractFactory.Product;

/**
 * @author weishitong
 * @date 2025/7/21 10:05
 */
public class AmdCpu implements Cpu {
    @Override
    public void run() {
        System.out.println("AMD CPU 正在运行");
    }
}
