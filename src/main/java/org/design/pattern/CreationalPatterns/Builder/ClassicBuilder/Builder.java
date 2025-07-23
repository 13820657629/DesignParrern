package org.design.pattern.CreationalPatterns.Builder.ClassicBuilder;

/**
 * @author weishitong
 * @date 2025/7/23 10:13
 */
public interface Builder {
    void buildCpu();
    void buildRam();
    void buildStorage();
    Computer getResult();
}
