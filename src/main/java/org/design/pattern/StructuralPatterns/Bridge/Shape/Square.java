package org.design.pattern.StructuralPatterns.Bridge.Shape;

import org.design.pattern.StructuralPatterns.Bridge.Color.Color;

/**
 * @author weishitong
 * @date 2025/7/30 19:41
 */
public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void draw() {
        System.out.println("画一个正方形...");
        color.fill();
    }
}
