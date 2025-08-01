package org.design.pattern.StructuralPatterns.Composite;

/**
 * @author weishitong
 * @date 2025/8/1 10:29
 */
public class Main {
    public static void main(String[] args) {
        FileComponent file1 = new FileLeaf("文件1.txt");
        FileComponent file2 = new FileLeaf("文件2.txt");

        FolderComposite folder1 = new FolderComposite("文件夹A");
        folder1.add(file1);
        folder1.add(file2);

        FolderComposite rootFolder = new FolderComposite("根目录");
        rootFolder.add(folder1);
        rootFolder.add(new FileLeaf("readme.md"));

        rootFolder.show();
    }
}
