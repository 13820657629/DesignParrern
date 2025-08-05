package org.design.pattern.StructuralPatterns.Flyweight;

/**
 * @author weishitong
 * @date 2025/8/5 15:17
 */
public class Client {
    public static void main(String[] args) {
        Shape circle1 = ShapeFactory.getCircle();
        circle1.draw("红色");

        Shape circle2 = ShapeFactory.getCircle();
        circle2.draw("蓝色");

        System.out.println("circle1 和 circle2 是同一个对象吗？ " + (circle1 == circle2));
    }
}
