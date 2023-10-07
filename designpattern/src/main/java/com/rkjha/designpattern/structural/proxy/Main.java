package com.rkjha.designpattern.structural.proxy;

public class Main {
    public static void main(String[] args) {
        // Use the proxy to load and display the image
        Image image = new ProxyImage("test.jpg");
        // The real image is only loaded and displayed when needed
        image.display();
        // The real image is cached and will be used for any future calls to display()
        image.display();
    }
}
