package leetcode_solutions;

public class Rectangle extends Shape {
    int width;
    int height;

    public Rectangle(int side) {
        this(side, side);
    }

    public Rectangle(int width, int height) {
        this("NotGiven", "", width, height);
    }

    public Rectangle(String name, String color, int width, int height) {
        super(name, color);
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getArea() {
        return this.getHeight() * this.getWidth();
    }

    @Override
    public int getPerimeter() {
        return 2 * (this.getHeight() + this.getWidth());
    }
}
