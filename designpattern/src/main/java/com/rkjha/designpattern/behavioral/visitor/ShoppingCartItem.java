package com.rkjha.designpattern.behavioral.visitor;

public interface ShoppingCartItem {
    double accept(ShoppingCartVisitor visitor);
}
