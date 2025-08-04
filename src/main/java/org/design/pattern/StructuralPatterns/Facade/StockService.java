package org.design.pattern.StructuralPatterns.Facade;

/**
 * 库存系统
 * @author weishitong
 * @date 2025/8/4 10:03
 */
public class StockService {
    public void deductStock(String productId) {
        System.out.println("商品库存扣减成功：" + productId);
    }
}
