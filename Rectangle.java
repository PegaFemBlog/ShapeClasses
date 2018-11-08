/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shape;

/**
 *
 * @author bacag
 */
public class Rectangle extends Shape {
    int length;
    int width;
    
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    @Override
    public double getPerimeter() {
        return (length * width)*2;
    }

    @Override
    public double getArea() {
        return length * width;
    }
    
}
