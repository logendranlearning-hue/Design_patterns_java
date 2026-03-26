package com.practice.behavioral.observer;

/**
 * This Record is a concrete Observer that implements the StockObserver interface.
 * It represents a trader app display that receives stock price updates and displays them to the user.
 * @param userId
 */
public record TraderAppDisplay(String userId) implements StockObserver {
    @Override
    public void updateStock(String stockName, double price) {
        System.out.println("Trader App Display update for UserId " + userId + " : " + stockName + " : " + price);
    }
}
