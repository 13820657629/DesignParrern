package org.design.pattern.CreationalPatterns.Singleton;

/**
 * 静态内部类（最推荐 懒加载+线程安全）
 * 优点：利用 JVM 类加载机制实现线程安全和延迟加载，推荐用这个方式。
 * @author weishitong
 * @date 2025/7/17 17:09
 */
public class Singleton4 {
    private Singleton4() {}

    private static class Holder {
        private static final Singleton4 INSTANCE = new Singleton4();
    }

    public static Singleton4 getInstance() {
        return Holder.INSTANCE;
    }
}
