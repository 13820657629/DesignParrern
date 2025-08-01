package org.design.pattern.StructuralPatterns.Composite;

/**
 * 叶子节点：文件
 * @author weishitong
 * @date 2025/8/1 10:25
 */
public class FileLeaf implements FileComponent {

    private String name;

    public FileLeaf(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println("文件：" + name);
    }

}
