package com.rkjha.designpattern.behavioral.chainofesponsibility;

public interface PurchaseApprover {
    void setNextApprover(PurchaseApprover approver);

    void approveRequest(Purchase request);

}
