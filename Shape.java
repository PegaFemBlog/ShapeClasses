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
public abstract class Shape {
    //String color; <---does this go here???
    
    //Methods have 3 parts
    //1. fields the attributes
    private double area;
    private double perimeter;
    
    // constructor that constructs the object
    public Square(double a, double b) {
        squareArea = sqA;
    }
    // methods that are the behaviors
    public void getArea() {
        squareArea =sqA;
    }
    
    public double getArea(){
        return squareArea;
    }
    public void getPerimeter();
}

