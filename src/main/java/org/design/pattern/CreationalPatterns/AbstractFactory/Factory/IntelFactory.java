package org.design.pattern.CreationalPatterns.AbstractFactory.Factory;

import org.design.pattern.CreationalPatterns.AbstractFactory.Product.Cpu;
import org.design.pattern.CreationalPatterns.AbstractFactory.Product.IntelCpu;
import org.design.pattern.CreationalPatterns.AbstractFactory.Product.IntelMainBoard;
import org.design.pattern.CreationalPatterns.AbstractFactory.Product.MainBoard;

/**
 * @author weishitong
 * @date 2025/7/21 10:06
 */
public class IntelFactory implements ComputerFactory {
    @Override
    public Cpu createCpu() {
        return new IntelCpu();
    }

    @Override
    public MainBoard createMainBoard() {
        return new IntelMainBoard();
    }
}
