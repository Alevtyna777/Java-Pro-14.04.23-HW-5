package shapes;

public class Circle implements Shape {


    public Circle(int i) {
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double calculateAreaOfTheFigure(double a,double h) {
        return (int)(a*h)*2;
    }
}
