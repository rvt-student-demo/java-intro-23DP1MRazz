package lv.rvt;

public class Box {
    private double width;
    private double height;
    private double length;
    private double side;

    Box (double width, double height, double length) {
        this.width = width;
        this.height = height;
        this.length = length;
    }

    Box (double side) {
        this.side = side;
    }

    Box (Box oldBox) {
        this.width = oldBox.getWidth();
        this.height = oldBox.getHeight();
        this.length = oldBox.getLength();
    }

    public double volume() {
        return width*height*length;
    }

    private double faceArea() {
        return width*height;
    }

    private double topArea() {
        return length*width;
    }

    private double sideArea() {
        return height*length;
    }

    double area() {
        return 2 * faceArea() + 2 * topArea() + 2 * sideArea() ;
    }

    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    public double getLength() {
        return this.length;
    }

    public Box biggerBox(Box oldBox) {
        return new Box(oldBox.getHeight()*1.25, oldBox.getWidth()*1.25, oldBox.getLength()*1.25);
    }

    public Box smallerBox(Box oldBox) {
        return new Box(oldBox.getHeight()*0.75, oldBox.getWidth()*0.75, oldBox.getLength()*0.75);
    }

    public boolean nests( Box outsideBox ) {
        if (this.height < outsideBox.getHeight() && this.width < outsideBox.getWidth() && this.length < outsideBox.getLength()) {
            return true;
        }
        return false;
    }
}
