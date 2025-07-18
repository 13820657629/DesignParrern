package org.design.pattern.CreationalPatterns.FactoryMethod;

import org.design.pattern.CreationalPatterns.FactoryMethod.Factory.ConcreteFactoryA;
import org.design.pattern.CreationalPatterns.FactoryMethod.Factory.Factory;
import org.design.pattern.CreationalPatterns.FactoryMethod.Product.Product;

/**
 * @author weishitong
 * @date 2025/7/18 10:33
 */
public class Client {
    public static void main(String[] args) {
        Factory factory = new ConcreteFactoryA();
        Product product = factory.createProduct();
        product.use(); // 输出：使用产品A
    }
}
