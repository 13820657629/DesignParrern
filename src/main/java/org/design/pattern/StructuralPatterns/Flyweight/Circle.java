package org.design.pattern.StructuralPatterns.Flyweight;

/**
 * 具体享元类
 * @author weishitong
 * @date 2025/8/5 15:16
 */
public class Circle implements Shape {
    private final String shapeType = "Circle"; // 内部状态
    private int radius = 5; // 内部状态
    @Override
    public void draw(String color) {
        System.out.println("绘制一个 " + color + " 的圆，半径: " + radius);
    }
}
