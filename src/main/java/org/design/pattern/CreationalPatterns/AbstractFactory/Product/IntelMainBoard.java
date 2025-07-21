package org.design.pattern.CreationalPatterns.AbstractFactory.Product;

/**
 * @author weishitong
 * @date 2025/7/21 10:04
 */
public class IntelMainBoard implements MainBoard {
    @Override
    public void install() {
        System.out.println("Intel 主板安装完成");
    }
}
