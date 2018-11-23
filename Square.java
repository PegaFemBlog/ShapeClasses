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
public class Square extends ShapesTwo {
    
    int length;
    
    //generate constructor for declaration
    public Square(int length) {
        this.length = length;
    }
    
    //import abstract methods from ShapesTwo
    @Override
    public double getArea() {
        return length * 4;
    }

    @Override
    public double getPerimeter() {
        return length * length;
    }
    
}
 