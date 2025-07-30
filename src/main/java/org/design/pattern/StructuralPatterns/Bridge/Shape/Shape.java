package org.design.pattern.StructuralPatterns.Bridge.Shape;

import org.design.pattern.StructuralPatterns.Bridge.Color.Color;

/**
 * @author weishitong
 * @date 2025/7/30 19:39
 */
public abstract class Shape {
    // 桥接点
    protected Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
