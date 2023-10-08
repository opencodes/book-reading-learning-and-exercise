package com.rkjha.designpattern.behavioral.visitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {
    @Override
    public double visit(Book book) {
        // Apply 10% discount for books
        return book.getPrice() * 0.9;
    }

    @Override
    public double visit(Fruit fruit) {
        // Calculate the total price for fruits
        return fruit.getPricePerKg() * fruit.getWeight();
    }
}
