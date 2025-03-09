package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;

public class Renderer {
    public Rectangle rectangle;
    public Circle circle;
    
    Renderer(Rectangle rectangle) {
        this.rectangle = rectangle;
    }
    Renderer (Circle circle){
        this.circle = circle;
    }

    void draw() {
        double area = circle.getArea();
        //double area1 = circle.getArea();

        // assume implementation

        System.out.println("Shape printed\n" + "Its area is " + area);
        //System.out.println("Shape printed\n" + "Its area is " + area1);
    }
}
