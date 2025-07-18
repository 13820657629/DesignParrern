package org.design.pattern.CreationalPatterns.FactoryMethod.Factory;

import org.design.pattern.CreationalPatterns.FactoryMethod.Product.ConcreteProductB;
import org.design.pattern.CreationalPatterns.FactoryMethod.Product.Product;

/**
 * @author weishitong
 * @date 2025/7/18 10:33
 */
public class ConcreteFactoryB implements Factory {
    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
