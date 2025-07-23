package org.design.pattern.CreationalPatterns.Builder.ClassicBuilder;

/**
 * @author weishitong
 * @date 2025/7/23 10:15
 */
public class Main {
    public static void main(String[] args) {
        Builder builder = new GamingComputerBuilder();
        Director director = new Director(builder);
        director.construct();
        Computer computer = builder.getResult();
        System.out.println(computer);
    }
}
