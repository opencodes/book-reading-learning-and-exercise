package com.rkjha.designpattern.behavioral.chainofesponsibility;

public class Director implements PurchaseApprover {

    private PurchaseApprover nextApprover;


    @Override
    public void setNextApprover(PurchaseApprover approver) {
        this.nextApprover = approver;
    }

    @Override
    public void approveRequest(Purchase purchase) {
        if (purchase.getAmount() < 10000) {
            System.out.println("Director approves the purchase of " + purchase.getAmount() + " dollars.");
        } else if (nextApprover != null) {
            nextApprover.approveRequest(purchase);
        } else {
            System.out.println("No one can approve the purchase of " + purchase.getAmount() + " dollars.");
        }
    }
}
