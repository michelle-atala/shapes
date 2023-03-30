class Square extends Shape{
    Square(int length,String center){super(length, center);}

    @Override
    double calculateArea() {
        return this.length * this.length;
    }
    @Override
    double calculatePerimeter(){
        return 4*(this.length);
    }
}
