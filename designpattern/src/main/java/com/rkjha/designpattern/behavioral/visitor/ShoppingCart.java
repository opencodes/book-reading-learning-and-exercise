package com.rkjha.designpattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<ShoppingCartItem> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(ShoppingCartItem item) {
        items.add(item);
    }

    public double calculateTotal(ShoppingCartVisitor visitor) {
        double total = 0;
        for (ShoppingCartItem item : items) {
            total += item.accept(visitor);
        }
        return total;
    }
}
