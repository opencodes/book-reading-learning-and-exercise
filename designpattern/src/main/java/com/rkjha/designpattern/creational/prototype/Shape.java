package com.rkjha.designpattern.creational.prototype;

public class Shape {
    protected String type;
    Area area;

    public Shape(String type, Area area) {
        this.type = type;
        this.area = area;
    }

    public double getArea() {
        return area.getArea();
    }

    public void setArea(Area area) {
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public Shape shallowCopy() {
        return new Shape(this.type, this.area);
    }

    public Shape deepCopy() {
        return new Shape(this.type, new Area(this.area.width, this.area.height));
    }
}
