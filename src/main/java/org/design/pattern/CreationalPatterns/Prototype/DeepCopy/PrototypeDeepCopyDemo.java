package org.design.pattern.CreationalPatterns.Prototype.DeepCopy;

/**
 * @author weishitong
 * @date 2025/7/22 11:02
 */
public class PrototypeDeepCopyDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype original = new ConcretePrototype("原型", new int[]{1, 2, 3});
        ConcretePrototype clone = (ConcretePrototype) original.clone();

        System.out.println("原始对象: " + original);
        System.out.println("克隆对象: " + clone);

        // 修改克隆对象的数据，验证深拷贝
        clone.getData()[0] = 100;
        clone.setName("克隆");

        System.out.println("修改克隆对象后:");
        System.out.println("原始对象: " + original);
        System.out.println("克隆对象: " + clone);
    }
}
