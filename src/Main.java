public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Ms. Mariette!");
    }
}

abstract class Shape {
    String Posn;
    int length;
    int width;
    Shape(int length, String position, Integer...width){
        this.Posn = position;
        this.length = length;
        if (width != null) this.width = width[0];
        else this.width = length;

    }

    abstract double calculateArea();
    abstract double calculatePerimeter();

    void contains(String posn){
        String[] center = this.Posn.split("x");
        String[] position = posn.split("x");
        int positionHorizontal = Integer.parseInt(position[0]);
        int positionVertical = Integer.parseInt(position[1]);
        double checkLength = (double)(positionHorizontal - Integer.parseInt(center[0]))/38;
        double checkWidth = (double)(positionVertical - Integer.parseInt(center[1]))/38;

        if(Math.abs(checkLength) < this.length && Math.abs(checkWidth) < this.width){
            System.out.println("Shape contains the given position");
        }
        else{
            System.out.println("Shape doesn't contain the given position");
        }
    }


}