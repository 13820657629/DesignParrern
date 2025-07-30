package org.design.pattern.StructuralPatterns.Bridge;

import org.design.pattern.StructuralPatterns.Bridge.Color.Green;
import org.design.pattern.StructuralPatterns.Bridge.Color.Red;
import org.design.pattern.StructuralPatterns.Bridge.Shape.Circle;
import org.design.pattern.StructuralPatterns.Bridge.Shape.Shape;
import org.design.pattern.StructuralPatterns.Bridge.Shape.Square;

/**
 * @author weishitong
 * @date 2025/7/30 19:42
 */
public class Main {
    public static void main(String[] args) {
        Shape redCircle = new Circle(new Red());
        redCircle.draw(); // 画一个圆，涂上红色

        Shape greenSquare = new Square(new Green());
        greenSquare.draw(); // 画一个正方形，涂上绿色
    }
}
