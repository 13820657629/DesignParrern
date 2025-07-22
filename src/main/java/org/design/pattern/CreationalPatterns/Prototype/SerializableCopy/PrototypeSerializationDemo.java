package org.design.pattern.CreationalPatterns.Prototype.SerializableCopy;

import java.io.IOException;

/**
 * @author weishitong
 * @date 2025/7/22 11:04
 */
public class PrototypeSerializationDemo {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ConcretePrototype original = new ConcretePrototype("原型", new int[]{1, 2, 3});
        ConcretePrototype clone = original.deepClone();

        System.out.println("原始对象: " + original);
        System.out.println("克隆对象: " + clone);

        clone.getData()[0] = 100;
        clone.setName("克隆");

        System.out.println("修改克隆对象后:");
        System.out.println("原始对象: " + original);
        System.out.println("克隆对象: " + clone);
    }
}
