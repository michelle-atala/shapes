class Rectangle extends Shape {
    private double height;
    private double width;

    Rectangle(int height, String position, Integer... width) {
        super(height, position, width);
    }

    public double calculateArea() {
        return this.height * this.width;
    }

    public double calculatePerimeter() {
        return 2 * (this.height + this.width);
    }
}
