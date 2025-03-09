package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.Circle;
import edu.cmu.cs.cs214.lab02.shapes.Rectangle;

public class Main {
    public static void main(String[] args) {


        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(3, 7);

        Renderer renderer = new Renderer(circle);
        //Renderer renderer1 = new Renderer(circle);

        renderer.draw();
        //renderer1.draw();
    }
}
