package org.design.pattern.CreationalPatterns.AbstractFactory.Factory;

import org.design.pattern.CreationalPatterns.AbstractFactory.Product.Cpu;
import org.design.pattern.CreationalPatterns.AbstractFactory.Product.MainBoard;

/**
 * @author weishitong
 * @date 2025/7/21 10:06
 */
public interface ComputerFactory {
    Cpu createCpu();
    MainBoard createMainBoard();
}
