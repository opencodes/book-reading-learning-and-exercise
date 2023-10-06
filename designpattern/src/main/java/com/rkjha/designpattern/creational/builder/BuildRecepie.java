package com.rkjha.designpattern.creational.builder;

public class BuildRecepie {
    public static void main(String[] args) {
        System.out.println("--- Paneer Butter Masala Recipe Builder ---\n");
        PaneerButterMasalaBuilder paneerButterMasalaBuilder = new PaneerButterMasalaBuilder();
        paneerButterMasalaBuilder.setPaneer("Paneer 1 Kg");
        paneerButterMasalaBuilder.setTomato("Tomato 1 kg");
        paneerButterMasalaBuilder.setOnion("2kg Onion");
        paneerButterMasalaBuilder.setSalt("Slat 200gm");
        PaneerButterMasala buildItem = paneerButterMasalaBuilder.getPaneerButterMasala();
        System.out.printf("Paneer Butter Masala Recipe: %s, %s, %s, %s", buildItem.getPaneer(), buildItem.getOnion(), buildItem.getSalt(), buildItem.getTomato());

        System.out.println("\n--- Paneer Butter Masala Recipe Builder - Chain ---\n");
        PaneerButterMasalaBuilder paneerButterMasalaBuilder2 = new PaneerButterMasalaBuilder();
        PaneerButterMasala buildItem2 = paneerButterMasalaBuilder2.setSalt("Salt 100gm").setOnion("Onion 2 Kg").setPaneer("Paneer 500gm").setTomato("Tomato 500gm").getPaneerButterMasala();
        System.out.printf("Paneer Butter Masala 2 Recipe: %s, %s, %s, %s", buildItem2.getPaneer(), buildItem2.getOnion(), buildItem2.getSalt(), buildItem2.getTomato());


    }

}
