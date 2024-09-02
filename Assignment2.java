
package com.mycompany.assignment2;

public class Assignment2 {

    public static void main(String[] args) {
        System.out.println(" ***** Person Detail *****");
        Person person = new Person("Dheeraj", "Gami", "26", "7999744425", "Indore", "Dheerajgami22@gmail.com");
        System.out.println(" Name = "+person.getName() + " "+person.getLastName());
        System.out.println(" Age = "+person.getAge()+" Year");
        System.out.println(" Mobile Number = "+person.getMobile());
        System.out.println(" Address = "+person.getAddress());
        System.out.println(" Email Address = "+person.getEmail());
    
        System.out.println("====================================================");
        Rectangle rectangle1 = new Rectangle(10, 5);
        Rectangle rectangle2 = new Rectangle(2.5);
        Rectangle rectangle3 = new Rectangle();
        
        System.out.println(" ***** First Rectangle *****");
        System.out.println("Area of Rectangle1 = "+rectangle1.getArea());
        System.out.println("Area of Rectangle2 = "+rectangle1.getArea(5, 2.5));
        System.out.println("Area of Perimeter1 = "+rectangle1.getPerimeterOfArea());
        System.out.println("Area of Perimeter2 = "+rectangle1.getPerimeterOfArea(20, 10.5));
        
        System.out.println(" ***** Second Rectangle *****");
        System.out.println("Area of Rectangle2 = "+rectangle2.getArea());
        System.out.println("Area of Rectangle2 = "+rectangle2.getArea(15, 7.5));
        System.out.println("Area of Perimeter2 = "+rectangle2.getPerimeterOfArea());
        System.out.println("Area of Perimeter2 = "+rectangle2.getPerimeterOfArea(25, 13.5));
        
        System.out.println(" ***** Third Rectangle *****");
        System.out.println("Area of Rectangle3 = "+rectangle3.getArea());
        System.out.println("Area of Rectangle3 = "+rectangle3.getArea(20, 9.5));
        System.out.println("Area of Perimeter3 = "+rectangle3.getPerimeterOfArea());
        System.out.println("Area of Perimeter3 = "+rectangle3.getPerimeterOfArea(30, 19.5));
    }   
}
