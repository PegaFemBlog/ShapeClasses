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
public class Triangle extends Shape {
    int side1;
    int side2;
    int side3;
    
    int base;
    int height;
    //We are assuming that this triangle is an EQUILATERAL
    // all sides have the same length
    
    
    public Triangle(int side1, int side2, int side3, int base, int height){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.base = base;
        this.height = height;
    }

    @Override
    public double getPerimeter() {
        return side1 * side2 + side3;
    }

    @Override
    public double getArea() {
        return (base * height)/2;
    }
    
}
