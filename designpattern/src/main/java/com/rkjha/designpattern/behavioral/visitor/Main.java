package com.rkjha.designpattern.behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        ShoppingCartItem book = new Book("Design Patterns", 50.0);
        ShoppingCartItem apple = new Fruit("Apple", 1.0, 2.5);
        ShoppingCartItem banana = new Fruit("Banana", 0.5, 3.0);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(book);
        cart.addItem(apple);
        cart.addItem(banana);

        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        double totalPrice = cart.calculateTotal(visitor);

        System.out.println("Total Price: $" + totalPrice);
    }
}
