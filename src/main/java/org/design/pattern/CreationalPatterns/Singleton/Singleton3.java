package org.design.pattern.CreationalPatterns.Singleton;

/**
 * 双重检查锁（推荐，懒加载，线程安全）
 * @author weishitong
 * @date 2025/7/17 16:59
 */
public class Singleton3 {
    //volatile: 防止指令重排序，确保对象初始化完成再被引用
    private static volatile Singleton3 instance;

    private Singleton3() {}

    public static Singleton3 getInstance() {
        if (instance == null) {
            synchronized (Singleton3.class) {
                if (instance == null) {
                    instance = new Singleton3();
                }
            }
        }

        return instance;
    }
}
