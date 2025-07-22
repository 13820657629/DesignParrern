package org.design.pattern.CreationalPatterns.Prototype.SerializableCopy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * @author weishitong
 * @date 2025/7/22 11:03
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConcretePrototype implements Serializable {
    private String name;
    private int[] data;

    // 利用序列化实现深拷贝
    public ConcretePrototype deepClone() throws IOException, ClassNotFoundException {
        // 写到内存流
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        // 从内存流读出来
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return (ConcretePrototype) ois.readObject();
    }

}
