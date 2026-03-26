package com.practice.behavioral.observer;

/**
 * This Record is a concrete Observer that implements the StockObserver interface.
 * It represents a mobile app display that receives stock price updates and displays them to the user.
 * @param userId
 */
public record MobileAppDisplay(String userId) implements StockObserver {
    @Override
    public void updateStock(String stockName, double price) {
        System.out.println("Push Notification for Mobile App for userId " + userId + " : " + stockName + " : " + price);
    }
}
