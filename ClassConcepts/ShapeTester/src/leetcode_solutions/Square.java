package leetcode_solutions;

public class Square extends Shape {
    int side;

    public Square(int side) {
        this("Unknown", "Unknown", side);
    }

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int getArea() {
        return this.side * this.side;
    }

    @Override
    public int getPerimeter() {
        return this.side * 4;
    }
}
