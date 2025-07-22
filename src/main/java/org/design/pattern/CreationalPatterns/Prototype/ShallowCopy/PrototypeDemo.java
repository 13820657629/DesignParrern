package org.design.pattern.CreationalPatterns.Prototype.ShallowCopy;

/**
 * @author weishitong
 * @date 2025/7/22 10:58
 */
public class PrototypeDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        ConcretePrototype original = new ConcretePrototype("原型对象");
        ConcretePrototype clone = (ConcretePrototype) original.clone();

        System.out.println("原始对象：" + original);
        System.out.println("克隆对象：" + clone);

        clone.setField("克隆对象修改后的值");

        System.out.println("修改克隆对象后：");
        System.out.println("原始对象：" + original);
        System.out.println("克隆对象：" + clone);

    }
}
