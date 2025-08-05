package org.design.pattern.StructuralPatterns.Flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @author weishitong
 * @date 2025/8/5 15:18
 */
public class ShapeFactory {
    private static final Map<String, Shape> shapeMap = new HashMap<>();

    public static Shape getCircle() {
        Shape shape = shapeMap.get("circle");
        if (shape == null) {
            shape = new Circle();
            shapeMap.put("circle", shape);
            System.out.println("创建新的 Circle 实例");
        }
        return shape;
    }
}
