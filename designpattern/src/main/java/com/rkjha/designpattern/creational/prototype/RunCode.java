package com.rkjha.designpattern.creational.prototype;

public class RunCode {
    public static void main(String[] args) {
        Area area = new Area(10, 5);
        // Create a Shape and get a copy of it
        Shape originalShape = new Shape("Circle", area);
        Shape d1 = originalShape.deepCopy();
        d1.setType("Rectangle");
        d1.area.setHeight(10);
        Shape d2 = originalShape.deepCopy();
        d2.setType("Square");
        d2.area.setHeight(15);

        System.out.println("Original Type: " + originalShape.getType());
        System.out.println("Original Area: " + originalShape.getArea());
        System.out.println("--- D1 \n");
        System.out.println("D1 Type: " + d1.getType());
        System.out.println("D1 Area: " + d1.getArea());

        System.out.println("--- D2 \n");
        System.out.println("D2 Shape Type: " + d2.getType());
        System.out.println("D2 Area: " + d2.getArea());
        System.out.println("D2 getType: " + d2.getType());
    }
}
