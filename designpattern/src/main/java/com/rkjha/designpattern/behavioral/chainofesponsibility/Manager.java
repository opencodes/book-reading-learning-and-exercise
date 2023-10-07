package com.rkjha.designpattern.behavioral.chainofesponsibility;

public class Manager implements PurchaseApprover {

    private PurchaseApprover nextApprover;

    @Override
    public void setNextApprover(PurchaseApprover approver) {
        this.nextApprover = approver;
    }

    @Override
    public void approveRequest(Purchase purchase) {
        if (purchase.getAmount() <= 1000) {
            System.out.println("Manager approves the purchase of " + purchase.getAmount() + " dollars.");
        } else if (nextApprover != null) {
            nextApprover.approveRequest(purchase);
        } else {
            System.out.println("No one can approve the purchase of " + purchase.getAmount() + " dollars.");
        }
    }
}
