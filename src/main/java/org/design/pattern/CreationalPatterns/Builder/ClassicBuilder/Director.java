package org.design.pattern.CreationalPatterns.Builder.ClassicBuilder;

/**
 * @author weishitong
 * @date 2025/7/23 10:14
 */
public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildCpu();
        builder.buildRam();
        builder.buildStorage();
    }
}
