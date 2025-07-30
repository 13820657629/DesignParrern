package org.design.pattern.StructuralPatterns.Bridge.Shape;

import org.design.pattern.StructuralPatterns.Bridge.Color.Color;

/**
 * @author weishitong
 * @date 2025/7/30 19:40
 */
public class Circle extends Shape {
    public Circle(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("画一个圆圈...");
        color.fill();
    }
}
