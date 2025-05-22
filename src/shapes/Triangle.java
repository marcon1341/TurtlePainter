package shapes;

import logo.Turtle;

public class Triangle extends Shape {
    private double side;
    public Triangle(Turtle turtle, int x, int y, String colorName, double border, double side) {
        super(turtle, x, y, colorName, border);
        this.side = side;
    }
    @Override
    public void draw() {
        super.draw();
        for(int i = 0; i < 3; i++) {
            turtle.forward(side);
            turtle.turnRight(120);
        }
        turtle.penUp();
    }
}
