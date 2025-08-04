package org.design.pattern.StructuralPatterns.Facade;

/**
 * 支付系统
 * @author weishitong
 * @date 2025/8/4 10:04
 */
public class PaymentService {
    public void pay(String userId, double amount) {
        System.out.println("用户" + userId + "支付了" + amount + " 元");
    }
}
