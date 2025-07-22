package org.design.pattern.CreationalPatterns.Prototype.ShallowCopy;

/**
 * @author weishitong
 * @date 2025/7/22 10:56
 */
public interface Prototype extends Cloneable {
    Prototype clone() throws CloneNotSupportedException;
}
