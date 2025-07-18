package org.design.pattern.CreationalPatterns.FactoryMethod.Product;

/**
 * @author weishitong
 * @date 2025/7/18 10:31
 */
public class ConcreteProductB implements Product {
    @Override
    public void use() {
        System.out.println("使用产品B");
    }
}
