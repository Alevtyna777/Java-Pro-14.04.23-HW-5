package shapes;

public class Application {
    public static void main ( String[] args ){
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle(5);
        shapes[1] = new Triangle(4,3);
        shapes[2] = new Square(6,4) {

            @Override
            public double getArea() {
                return 0;
            }

            @Override
            public double calculateAreaOfTheFigure(double a, double h) {
                return 0;
            }
        };
    }
}
