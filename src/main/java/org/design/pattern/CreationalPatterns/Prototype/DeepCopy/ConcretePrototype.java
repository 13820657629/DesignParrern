package org.design.pattern.CreationalPatterns.Prototype.DeepCopy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author weishitong
 * @date 2025/7/22 11:00
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConcretePrototype implements Cloneable {
    private String name;
    private int[] data; // 引用类型字段

    @Override
    protected Object clone() throws CloneNotSupportedException {
        ConcretePrototype cloned = (ConcretePrototype) super.clone();
        // 手动深拷贝数组
        cloned.data = data != null ? data.clone() : null;
        return cloned;
    }
}
