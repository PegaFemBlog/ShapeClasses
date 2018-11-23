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
public class Circle extends ShapesTwo{
    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (Math.PI * (radius * radius));
    }

    @Override
    public double getPerimeter() {
        return (2*Math.PI*radius);
    }
    
}
