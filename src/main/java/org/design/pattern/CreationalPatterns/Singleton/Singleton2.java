package org.design.pattern.CreationalPatterns.Singleton;

/**
 * 单例模式 懒汉式（线程不安全，不推荐）
 * @author weishitong
 * @date 2025/7/17 16:56
 */
public class Singleton2 {
    private static Singleton2 instance;

    private Singleton2() {};

    public static Singleton2 getInstance() {
        if (instance == null) {
            instance = new Singleton2();
        }
        return instance;
    }
}
