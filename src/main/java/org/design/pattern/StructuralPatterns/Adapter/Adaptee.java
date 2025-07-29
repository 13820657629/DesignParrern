package org.design.pattern.StructuralPatterns.Adapter;

/**
 * 源角色（不兼容的接口）
 * @author weishitong
 * @date 2025/7/29 9:42
 */
public class Adaptee {
    public void specificRequest() {
        System.out.println("被适配者的方法");
    }
}
