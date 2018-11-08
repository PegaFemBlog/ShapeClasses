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
public class Square extends Shape {
    int length;
//constructor
    public Square(int length) {
        this.length = length;
    }
//clicked on the error message and this imported from Shape
    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }
    
    
}
