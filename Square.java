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
public class Square {
    private double width, length;
    
    public Square(double width, double length) {
        this.width = width;
        this.length = length;
    }
    
    public double getArea() {
        //area = length * width
        return length * width;
    }
    
    public double getPerimeter() {
        //perimeter = 2(length * width)
        return (length * width)*2;
    }
}
