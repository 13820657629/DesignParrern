package org.design.pattern.CreationalPatterns.Builder.FluentBuilder;

/**
 * @author weishitong
 * @date 2025/7/23 10:16
 */
public class Computer {
    private String cpu;
    private String ram;
    private String storage;

    // 私有构造
    private Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.ram = builder.ram;
        this.storage = builder.storage;
    }

    public static class Builder {
        private String cpu;
        private String ram;
        private String storage;

        public Builder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder ram(String ram) {
            this.ram = ram;
            return this;
        }

        public Builder storage(String storage) {
            this.storage = storage;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }

    public String toString() {
        return "电脑配置：CPU=" + cpu + ", 内存=" + ram + ", 硬盘=" + storage;
    }
}
