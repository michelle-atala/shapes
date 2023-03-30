 public class Rectangle {
    private double height;
    private double width;

     Rectangle(int height, String position, Integer... width) {
         super(height, position, width);
     }
    }
   public double Area() {
        return this.height * this.width;
   }
   public double Perimeter() {
        return 2 * (this.height + this.width);
     }

     public double getWidth() {
         return width;
     }

     public void setWidth(double width) {
         this.width = width;
     }

     public double getHeight() {
         return height;
     }

     public void setHeight(double height) {
         this.height = height;
     }
 }
