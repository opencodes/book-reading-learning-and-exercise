package com.rkjha.designpattern.composite;


public class RunCode {
    public static void main(String[] args) {
        OneUnit mbDrawerBig = new OneUnit(100000, "Mb Drawer Big");
        OneUnit tvUnit = new OneUnit(25000, "TV Unit");
        OneUnit bunkBed = new OneUnit(50000, "Bunk Bed");
        OneUnit kidDrawer = new OneUnit(75000, "Kid Drawer");
        OneUnit kitchenUnit = new OneUnit(150000, "Kitchen Unit");
        OneUnit kitchenAplliance = new OneUnit(30000, "Kitchen Appliance");

        BundleUnit mbRoom = new BundleUnit("Master Bed Room");
        mbRoom.addUnit(mbDrawerBig);
        mbRoom.addUnit(tvUnit);
        System.out.println(mbRoom.getPrice());

        BundleUnit kidsroom = new BundleUnit("Kids Room");
        kidsroom.addUnit(bunkBed);
        kidsroom.addUnit(kidDrawer);
        System.out.println(kidsroom.getPrice());

        BundleUnit kitchen = new BundleUnit("Kitchen");
        kitchen.addUnit(kitchenUnit);
        kitchen.addUnit(kitchenAplliance);
        System.out.println(kitchen.getPrice());

        // Create a bundle for the whole home
        BundleUnit homeBundle = new BundleUnit("Home");
        homeBundle.addUnit(kitchenUnit);
        homeBundle.addUnit(mbRoom);
        homeBundle.addUnit(kidsroom);

        System.out.printf("Total Price: %.2f\n", homeBundle.getPrice());
    }
}
