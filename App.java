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
public class App {
    public static void main(String[] args) {
        //create new objects here by calling on the ShapesTwo class
        ShapesTwo square = new Square(10);
        ShapesTwo rectangle = new Rectangle(5, 8);
        ShapesTwo triangle = new Triangle(4, 5, 6, 8, 10);
        ShapesTwo circle = new Circle(7);
        
        //call the methods in the Square class
        // with the ( . ) dot operator
        double sqArea = square.getArea();
        double sqPer = square.getPerimeter();
        System.out.println(sqArea);
        System.out.println(sqPer);
        
        double rectArea = rectangle.getArea();
        double rectPer = rectangle.getPerimeter();
        System.out.println(rectArea);
        System.out.println(rectPer);
        
        double triArea = triangle.getArea();
        double triPer = triangle.getPerimeter();
        System.out.println(triArea);
        System.out.println(triPer);
        
        double cirArea = circle.getArea();
        double cirPer = circle.getPerimeter();
        System.out.println(cirArea);
        System.out.println(cirPer);
        
        
    }
}
