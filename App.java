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
public class App {
    public static void main(String[] args) {
        
        Shape square = new Square(10);
        Shape rectangle = new Rectangle(3, 2);
        Shape triangle = new Triangle(2, 3, 4, 5, 6);
        Shape circle = new Circle(5);
        
        double squareArea = square.getArea();
        double squarePerimeter = square.getPerimeter();
        System.out.println(squareArea);
        System.out.println(squarePerimeter);
        
    }
}

