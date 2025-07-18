package org.design.pattern.CreationalPatterns.FactoryMethod.Factory;

import org.design.pattern.CreationalPatterns.FactoryMethod.Product.Product;

/**
 * 工厂方法模式 核心思想是：将对象的创建交由子类来完成，从而实现对象创建的解耦。
 * 工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化的类。工厂方法让类的实例化推迟到子类中进行。
 * @author weishitong
 * @date 2025/7/18 10:30
 */
public interface Factory {
    Product createProduct();
}
