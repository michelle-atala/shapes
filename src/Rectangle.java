class Rectangle extends Shape{
    private double height;
    private double width;

     Rectangle(int height, String position, Integer... width) {
         super(height, position,width);
     }

   public double calculateArea() {
        return height * width;
   }
   public double calculatePerimeter() {
        return 2 * (height + width);
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
