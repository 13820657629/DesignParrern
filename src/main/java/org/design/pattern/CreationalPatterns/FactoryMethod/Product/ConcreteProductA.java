package org.design.pattern.CreationalPatterns.FactoryMethod.Product;

/**
 * @author weishitong
 * @date 2025/7/18 10:30
 */
public class ConcreteProductA implements Product {
    @Override
    public void use() {
        System.out.println("使用产品A");
    }
}
