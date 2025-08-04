package org.design.pattern.StructuralPatterns.Facade;

/**
 * @author weishitong
 * @date 2025/8/4 10:10
 */
public class Client {
    public static void main(String[] args) {
        OrderFacade orderFacade = new OrderFacade();
        orderFacade.placeOrder("u123", "p456", "o789", 99.9);
    }
}
