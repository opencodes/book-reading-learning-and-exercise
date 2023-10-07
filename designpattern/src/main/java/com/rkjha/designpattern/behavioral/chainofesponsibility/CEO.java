package com.rkjha.designpattern.behavioral.chainofesponsibility;

public class CEO implements PurchaseApprover {
    @Override
    public void setNextApprover(PurchaseApprover approver) {

    }

    @Override
    public void approveRequest(Purchase purchase) {
        System.out.println("CEO approves the purchase of " + purchase.getAmount() + " dollars.");
    }
}
