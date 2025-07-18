package org.design.pattern.CreationalPatterns.Singleton;

/**
 * 单例模式 饿汉式（线程安全 类加载时创建）
 * 优点：简单，线程安全
 * 缺点：类加载时就实例化，不管是否用到，浪费内存
 * @author weishitong
 * @date 2025/7/17 16:53
 */
public class Singleton1 {
    private static final Singleton1 instance = new Singleton1();

    // 私有构造
    private Singleton1() {}

    public static Singleton1 getInstance() {
        return instance;
    }

}
