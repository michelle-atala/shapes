class Square extends Shape{
    Square(int length,String position){super(length, position);}

    @Override
    double calculateArea() {
        return length * length;
    }
    @Override
    double calculatePerimeter(){
        return 4*length;
    }
}
