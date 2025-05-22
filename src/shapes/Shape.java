package shapes;

import logo.Turtle;

import java.awt.*;

public abstract class Shape implements IDrawable {
    protected Turtle turtle;
    protected int x, y;
    protected double border;
    protected String colorName;

    // Constructor
    public Shape(Turtle turtle, int x, int y, String colorName, double border) {
        this.turtle = turtle;
        this.x = x;
        this.y = y;
        this.border = border;
        this.colorName = colorName;
    }

    public void draw() {
        // child classes override this
        setColor();
        turtle.penUp();
        turtle.goTo(x, y);
        turtle.setHeading(0);
        turtle.setPenWidth(border);
        turtle.penDown();
    }

    protected void setColor() {
        switch (colorName.toUpperCase()) {
            case "GREEN":
                turtle.setColor(Color.GREEN);
                break;
            case "BLUE":
                turtle.setColor(Color.BLUE);
                break;
            case "MAGENTA":
                turtle.setColor(Color.MAGENTA);
                break;
            case "YELLOW":
                turtle.setColor(Color.YELLOW);
                break;
            case "RED":
                turtle.setColor(Color.RED);
                break;
            default:
                turtle.setColor(Color.BLACK);
                break;
        }
    }
}