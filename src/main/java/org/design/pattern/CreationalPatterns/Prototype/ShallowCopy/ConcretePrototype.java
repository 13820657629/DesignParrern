package org.design.pattern.CreationalPatterns.Prototype.ShallowCopy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author weishitong
 * @date 2025/7/22 10:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConcretePrototype implements Prototype {
    private String field;

    @Override
    public Prototype clone() throws CloneNotSupportedException {
        return (ConcretePrototype) super.clone();
    }
}
