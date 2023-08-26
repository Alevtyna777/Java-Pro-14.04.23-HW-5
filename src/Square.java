public abstract class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square(int side, int i) {
    }


    public double setArea() {
        double side1 = side;
        return side1;
    }

    @Override
    public double getArea() {
        double squareArea = (side * side);
        return squareArea;
    }
}




// public class Square implements Shape {
//    private double length;
//
//    public Square(double length) {
//        this.length = length;
//    }
//
//    public double getLength() {
//        return length;
//    }
//
//    public void setLength(double length) {
//        this.length = length;
//    }
//
//
//
//    @Override
//    public double getArea() {
//        double squareArea = (length * length);
//        return  squareArea;
//    }
//}

