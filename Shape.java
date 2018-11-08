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
    public abstract double getPerimeter();
    public abstract double getArea();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    protected String color;
}

/*

//Sqare perimeter and area
public abstract class Square {
   private double width, height;
    
    public Square() {
        this.width = 0;
        this.height = 0;
    }
    public Square(double width, double height) {
        this.height = height;
        this.width = width;
    }
    public double getArea()
    {
       return width * height;
    }
    public double getPerimeter() {
        return 2 * width * height;
    }
}

// Rectangle perimeter and area 
public class Rectangle extends Shape {
    private double width, height;
    
    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }
    public double getArea()
    {
       return width * height;
    }
    public double getPerimeter() {
        return 2 * width * height;
    }
    
//Triangle perimeter and area
public class Triangle {
   private double side1, side2, side3;
   private double base, height;
   
   public Triangle() {
       this.side1 = 0;
       this.side2 = 0;
       this.side3 = 0;
       this.base = 0;
       this.base = 0;
   }
   public Triangle(double side1, double side2, double side3, double base, double height) {
       this.side1 = side1;
       this.side2 = side2;
       this.side3 = side3;
       this.base = base;
       this.height = height;
   }
   public double getArea () {
       return (base * height)/.05;
   }
   public double getPerimeter() {
       return side1 + side2 + side3;
   }
    
}
public class Circle {
    
    
}
}
*/
