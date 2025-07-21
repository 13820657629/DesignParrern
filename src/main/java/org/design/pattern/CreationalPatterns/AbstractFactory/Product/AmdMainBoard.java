package org.design.pattern.CreationalPatterns.AbstractFactory.Product;

/**
 * @author weishitong
 * @date 2025/7/21 10:05
 */
public class AmdMainBoard implements MainBoard {
    @Override
    public void install() {
        System.out.println("AMD 主板完成");
    }
}
