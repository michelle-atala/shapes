class Rectangle extends Shape {

    Rectangle(int length, String center, Integer... width) {
        super(length, center, width);
    }

    public double calculateArea() {
        return this.length * this.width;
    }

    public double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }
}
