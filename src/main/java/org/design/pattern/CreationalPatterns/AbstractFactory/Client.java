package org.design.pattern.CreationalPatterns.AbstractFactory;

import org.design.pattern.CreationalPatterns.AbstractFactory.Factory.ComputerFactory;
import org.design.pattern.CreationalPatterns.AbstractFactory.Factory.IntelFactory;
import org.design.pattern.CreationalPatterns.AbstractFactory.Product.Cpu;
import org.design.pattern.CreationalPatterns.AbstractFactory.Product.MainBoard;

/**
 * 抽象工厂模式：关心的是一整套兼容的产品配置，而非工厂方法模式只关心某个组件
 * @author weishitong
 * @date 2025/7/21 10:12
 */
public class Client {
    public static void main(String[] args) {
        ComputerFactory factory = new IntelFactory();
        Cpu cpu = factory.createCpu();
        MainBoard mainBoard = factory.createMainBoard();

        cpu.run();
        mainBoard.install();
    }
}
