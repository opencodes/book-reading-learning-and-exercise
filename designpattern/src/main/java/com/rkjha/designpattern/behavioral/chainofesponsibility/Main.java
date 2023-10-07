package com.rkjha.designpattern.behavioral.chainofesponsibility;

public class Main {
    public static void main(String[] args) {
        // Create the chain of approvers
        PurchaseApprover manager = new Manager();
        PurchaseApprover director = new Director();
        PurchaseApprover ceo = new CEO();

        manager.setNextApprover(director);
        director.setNextApprover(ceo);

        // Create and process purchase requests
        Purchase purchase1 = new Purchase(800);
        manager.approveRequest(purchase1);

        Purchase purchase2 = new Purchase(3500);
        manager.approveRequest(purchase2);

        Purchase purchase3 = new Purchase(10000);
        manager.approveRequest(purchase3);
    }
}
