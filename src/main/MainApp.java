package main;

import logo.Turtle;
import logo.World;
import shapes.*;

import java.util.Scanner;

public class MainApp {
    // Static fields so all methods can access
    private static Turtle turtle;
    private static World world;

    // Prompt for String
    public static String prompt(String message, String defaultValue) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        System.out.printf("%s (%s): ", message, defaultValue);
        name = scanner.nextLine();
        if (name.trim().isEmpty()) {
            name = defaultValue;
        }
        return name;
    }

    // Prompt for int
    public static int promptInt(String message, int defaultValue) {
        Integer i = null;
        while (i == null) {
            String text = prompt(message, Integer.toString(defaultValue));
            try {
                i = Integer.parseInt(text);
            } catch (Exception e) {
                System.out.println("Please enter a valid number!");
            }
        }
        return i;
    }
    public static void addShape() {
        System.out.println("\nADD SHAPE");

        int shapeType = promptInt("Shapes: \n1-Square, \n2-Circle, \n3-Triangle, \n4-Hexagon, \nEnter choice: ", 1);
        String colorName = prompt("Color", "RED");
        double border = promptInt("Border width", 5);
        int x = promptInt("x position", 0);
        int y = promptInt("y position", 0);

        Shape shape = null;
        String shapeName = "";
        switch (shapeType) {
            case 1: // Square
                double side = promptInt("Side length", 50);
                shape = new Square(turtle, x, y, colorName, border, side);
                shapeName = "Square";
                break;
            case 2: // Circle
                double radius = promptInt("Radius", 40);
                shape = new Circle(turtle, x, y, colorName, border, radius);
                shapeName = "Circle";
                break;
            case 3: // Triangle
                double triSide = promptInt("Side length", 50);
                shape = new Triangle(turtle, x, y, colorName, border, triSide);
                shapeName = "Triangle";
                break;
            case 4: // Hexagon
                double hexSide = promptInt("Side length", 50);
                shape = new Hexagon(turtle, x, y, colorName, border, hexSide);
                shapeName = "Hexagon";
                break;
            default:
                System.out.println("Invalid shape.");
                return;
        }

        shape.draw();
        System.out.println(shapeName +" Created successfully!");
    }

    // Save method
    public static void save() {
        System.out.println("SAVING...");
        String directory = System.getProperty("user.dir");
        String fileName = prompt("File Name", "myfile.png");
        world.saveAs(directory + "/" + fileName);
        System.out.println("Save as "+ fileName);
    }

    // Main menu
    public static void mainMenu() {
        int choice = -1;
        while (choice != 0) {
            System.out.println("MAIN MENU\n1) Add Shape\n2) Save\n0) Exit");
            choice = promptInt("Enter choice", 1);
            switch (choice) {
                case 1:
                    addShape();
                    break;
                case 2:
                    save();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
    // main() entry point
    public static void main(String[] args) {
        int size = promptInt("Canvas size", 600);
        world = new World(size, size);
        turtle = new Turtle(world, size * -0.5, size * -0.5);
        mainMenu();
        System.out.println("BYE BYE");
    }
}
