package shapes;

import logo.Turtle;

public class Hexagon extends Shape {
    private double side;
    public Hexagon(Turtle turtle, int x, int y, String colorName, double border, double side) {
        super(turtle, x, y, colorName, border);
        this.side = side;
    }
    @Override
    public void draw() {
        super.draw();
        for(int i = 0; i < 6; i++) {
            turtle.forward(side);
            turtle.turnRight(60);
        }
        turtle.penUp();
    }
}
