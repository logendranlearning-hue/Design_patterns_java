package com.practice.behavioral.observer;

/**
 * This Record is a concrete Observer that implements the StockObserver interface.
 * It represents a TV news screen that receives stock price updates and displays them to the user.
 * @param userId
 */
public record TvNewsScreen(String userId) implements StockObserver {
    @Override
    public void updateStock(String stockName, double price) {
        System.out.println("Live text update in TV screen for userId " + userId + " : " + stockName + " : " + price);
    }
}
