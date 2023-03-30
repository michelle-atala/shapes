class Square extends Shape{
    Square(int length,String position){super(length, position);}

    @Override
    double calculateArea() {
        return this.length * this.length;
    }
    @Override
    double calculatePerimeter(){
        return 4*(this.length);
    }
}
