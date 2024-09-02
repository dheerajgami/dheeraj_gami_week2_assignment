package com.mycompany.assignment2;

public class Rectangle {
    private double length;
    private double breadth;
    
    public Rectangle(double l,double b){
        length = l;
        breadth = b;
    }
    
    public Rectangle(double size){
        length = breadth = size;
    }
    
    public Rectangle(){
        length = breadth = 1.0;    
    }
    
    public double getArea(){
        return length * breadth;
    }
    
    public double getArea(double l,double b){
        return l * b;
    }
    
    public double getPerimeterOfArea(){
        return 2 * (length + breadth);
    }
    
    public double getPerimeterOfArea(double l,double b){
        return 2 * (l + b);
    }
}
