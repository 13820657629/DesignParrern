package org.design.pattern.StructuralPatterns.Facade;

/**
 * 物流系统
 * @author weishitong
 * @date 2025/8/4 10:05
 */
public class LogisticsService {
    public void createDeliveryOrder(String orderId) {
        System.out.println("订单" + orderId + " 已生成配送");
    }
}
