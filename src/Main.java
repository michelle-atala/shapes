public class Main {
    public static void main(String[] args) {
        System.out.println("Hello!");

        Shape myCircle = new Circle(12, "500x500");
        System.out.println("Circle");
        System.out.println("Area:"+myCircle.calculateArea());
        System.out.println("Perimeter:"+myCircle.calculatePerimeter());
        myCircle.contains("400x400");

        Shape myRectangle = new Rectangle (15,"500x500",9);
        System.out.println("Rectangle");
        System.out.println("Area:"+myRectangle.calculateArea());
        System.out.println("Perimeter:"+myRectangle.calculatePerimeter());
        myRectangle.contains("400x400");

        Shape smallSquare = new Square(14,"640x640");
        System.out.println("Square");
        System.out.println("Area: "+smallSquare.calculateArea());
        System.out.println("Perimeter: "+smallSquare.calculatePerimeter());
        smallSquare.contains("400x400");
    }
}

abstract class Shape {
    String Posn;
    int length;
    int width;
    Shape(int length, String position, Integer...width){
        this.Posn = position;
        this.length = length;
        if (width.length > 0) this.width = width[0];
        else this.width = length;

    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

    void contains(String posn){
        String[] center = this.Posn.split("x");        //
        String[] position = posn.split("x");
        int positionHorizontal = Integer.parseInt(position[0]);
        int positionVertical = Integer.parseInt(position[1]);
        double checkLength = (double)(positionHorizontal - Integer.parseInt(center[0]))/38;
        //1 cm on a screen represents ~38 pixels
        double checkWidth = (double)(positionVertical - Integer.parseInt(center[1]))/38;

        if(Math.abs(checkLength) < this.length && Math.abs(checkWidth) < this.width){
            System.out.println("Shape contains the given position\n");
        }
        else{
            System.out.println("Shape doesn't contain the given position\n");
        }
    }
// the position of the pixel doesn't exist because the length if

}

class Circle extends Shape {
    final double PI = 3.14;

    Circle(int length, String position, Integer... width) {
        super(length, position, width);
    }

    @Override
    double calculateArea() {
        return PI * (double)length * width;
    }

    @Override
    double calculatePerimeter() {
        return 2 * PI * (double)length;
    }
}