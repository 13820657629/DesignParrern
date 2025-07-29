package org.design.pattern.StructuralPatterns.Adapter;

/**
 * @author weishitong
 * @date 2025/7/29 9:43
 */
public class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public void request() {
        adaptee.specificRequest();
    }
}
