class Rectangle extends Shape {

    Rectangle(int length, String position, Integer... width) {
        super(length, position, width);
    }

    public double calculateArea() {
        return this.length * this.width;
    }

    public double calculatePerimeter() {
        return 2 * (this.length + this.width);
    }
}
