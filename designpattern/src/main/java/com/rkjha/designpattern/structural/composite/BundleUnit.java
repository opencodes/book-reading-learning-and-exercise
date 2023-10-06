package com.rkjha.designpattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class BundleUnit implements SingleUnit {
    private String name;
    private List<SingleUnit> unitList;

    public BundleUnit(String name) {
        this.name = name;
        this.unitList = new ArrayList<>();
    }

    public void addUnit(SingleUnit unit) {
        this.unitList.add(unit);
    }

    public void removeUnit(SingleUnit unit) {
        this.unitList.remove(unit);
    }

    public String getName() {
        return name;
    }

    @Override
    public float getPrice() {
        float totalPrice = 0;
        System.out.printf("*************** Total Price for Bundle Item:- %s ************** \n", this.getName());
        // iterate through members
        for (SingleUnit singleUnit : unitList) {
            System.out.printf("Item: %s Price: %.2f\n", singleUnit.getName(), singleUnit.getPrice());
            totalPrice += singleUnit.getPrice();
        }
        return totalPrice;
    }
}
