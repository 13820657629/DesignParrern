package org.design.pattern.CreationalPatterns.Builder.ClassicBuilder;

/**
 * @author weishitong
 * @date 2025/7/23 10:13
 */
public class GamingComputerBuilder implements Builder {
    private Computer computer = new Computer();

    public void buildCpu() {
        computer.setCpu("Intel i9");
    }

    public void buildRam() {
        computer.setRam("32GB");
    }

    public void buildStorage() {
        computer.setStorage("1TB SSD");
    }

    public Computer getResult() {
        return computer;
    }
}
