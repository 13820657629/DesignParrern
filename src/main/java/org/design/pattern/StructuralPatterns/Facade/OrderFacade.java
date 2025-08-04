package org.design.pattern.StructuralPatterns.Facade;

/**
 * 外观类（对外暴露统一的下单接口）
 * @author weishitong
 * @date 2025/8/4 10:06
 */
public class OrderFacade {
    private StockService stockService;
    private PaymentService paymentService;
    private LogisticsService logisticsService;

    public OrderFacade() {
        this.stockService = new StockService();
        this.paymentService = new PaymentService();
        this.logisticsService = new LogisticsService();
    }

    public void placeOrder(String userId, String productId, String orderId, double amount) {
        System.out.println("开始下单流程...");
        stockService.deductStock(productId);
        paymentService.pay(userId, amount);
        logisticsService.createDeliveryOrder(orderId);
        System.out.println("下单流程完成！");
    }

}
