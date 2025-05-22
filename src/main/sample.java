//package shapes;
//
//import logo.Turtle;
//
//import java.awt.*;
//
//public abstract class Shape implements IDrawable {
//    protected Turtle turtle;
//    protected int x;
//    protected int y;
//    protected double border;
//    protected String colorName;
//
//    // Constructor
//    public Shape(Turtle turtle, int x, int y, String colorName, double border) {
//        this.turtle = turtle;
//        this.x = x;
//        this.y = y;
//        this.border = border;
//        this.colorName = colorName;
//    }
//
//    public void draw() {
//        // child classes override this
//        setColor();
//        turtle.penUp();
//        turtle.goTo(x, y);
//        turtle.setHeading(0);
//        turtle.setPenWidth(border);
//        turtle.penDown();
//    }
//
//    protected void setColor() {
//        if (colorName.equalsIgnoreCase("GREEN")) {
//            turtle.setColor(Color.GREEN);
//        } else if (colorName.equalsIgnoreCase("BLUE")) {
//            turtle.setColor(Color.BLUE);
//        } else if (colorName.equalsIgnoreCase("MAGENTA")) {
//            turtle.setColor(Color.MAGENTA);
//        } else if (colorName.equalsIgnoreCase("YELLOW")) {
//            turtle.setColor(Color.YELLOW);
//        } else if (colorName.equalsIgnoreCase("RED")) {
//            turtle.setColor(Color.RED);
//        } else {
//            turtle.setColor(Color.BLACK);
//        }
//    }
//}
