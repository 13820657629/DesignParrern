package org.design.pattern.StructuralPatterns.Bridge.Color;

/**
 * @author weishitong
 * @date 2025/7/30 19:37
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("图上红色");
    }
}
