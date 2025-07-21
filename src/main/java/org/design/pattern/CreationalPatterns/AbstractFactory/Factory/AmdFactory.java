package org.design.pattern.CreationalPatterns.AbstractFactory.Factory;

import org.design.pattern.CreationalPatterns.AbstractFactory.Product.AmdCpu;
import org.design.pattern.CreationalPatterns.AbstractFactory.Product.AmdMainBoard;
import org.design.pattern.CreationalPatterns.AbstractFactory.Product.Cpu;
import org.design.pattern.CreationalPatterns.AbstractFactory.Product.MainBoard;

/**
 * @author weishitong
 * @date 2025/7/21 10:08
 */
public class AmdFactory implements ComputerFactory {
    @Override
    public Cpu createCpu() {
        return new AmdCpu();
    }

    @Override
    public MainBoard createMainBoard() {
        return new AmdMainBoard();
    }
}
