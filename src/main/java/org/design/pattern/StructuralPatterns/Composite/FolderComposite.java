package org.design.pattern.StructuralPatterns.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author weishitong
 * @date 2025/8/1 10:27
 */
public class FolderComposite implements FileComponent {

    private String name;

    private List<FileComponent> children = new ArrayList<>();

    public FolderComposite(String name) {
        this.name = name;
    }

    public void add(FileComponent component) {
        children.add(component);
    }

    @Override
    public void show() {
        System.out.println("文件夹：" + name);
        for (FileComponent child : children) {
            child.show();
        }
    }
}
