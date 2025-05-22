package shapes;

import logo.Turtle;

public class Square extends Shape {
    private double side;
    public Square(Turtle turtle, int x, int y, String colorName, double border, double side) {
        super(turtle, x, y, colorName, border);
        this.side = side;
    }

    @Override
    public void draw() {
        super.draw();
        for(int i = 0; i < 4; i++){
            turtle.forward(side);
            turtle.turnRight(90);
        }
        turtle.penUp();
    }
}
