package org.design.pattern.CreationalPatterns.Builder.FluentBuilder;

/**
 * @author weishitong
 * @date 2025/7/23 10:17
 */
public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder()
                .cpu("Apple M3")
                .ram("16GB")
                .storage("512GB SSD")
                .build();

        System.out.println(computer);
        // 输出：电脑配置：CPU=Apple M3, 内存=16GB, 硬盘=512GB SSD
    }
}
