package org.design.pattern.CreationalPatterns.FactoryMethod.Factory;

import org.design.pattern.CreationalPatterns.FactoryMethod.Product.ConcreteProductA;
import org.design.pattern.CreationalPatterns.FactoryMethod.Product.Product;

/**
 * @author weishitong
 * @date 2025/7/18 10:32
 */
public class ConcreteFactoryA implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
