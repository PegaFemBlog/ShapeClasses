/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.shapestwo;

/**
 *
 * @author bacag
 */
public class Triangle extends ShapesTwo {
    int side1;
    int side2;
    int side3;
    int base;
    int height;

    public Triangle(int side1, int side2, int side3, int base, int height) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height)/2;
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }
    
}
