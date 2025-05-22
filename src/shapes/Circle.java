package shapes;

import logo.Turtle;

public class Circle extends Shape {
    private double radius;
    public Circle(Turtle turtle, int x, int y, String colorName, double border, double radius) {
        super(turtle, x, y, colorName, border);
        this.radius = radius;
    }
    @Override
    public void draw() {
        super.draw();
        // Draw circle with the Turtle:
        int steps = 120; //
        double stepLength = 2 * Math.PI * radius / steps;
        double stepAngle = 360.0 / steps;
        for (int i = 0; i < steps; i++) {
            turtle.forward(stepLength);
            turtle.turnRight(stepAngle);
        }
        turtle.penUp();
    }
}
