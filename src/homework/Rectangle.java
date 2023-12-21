package homework;

public class Rectangle implements Shape{
    double a;
    double b;
    public Rectangle(double a, double b){
        this.a = a;
        this.b = b;
    }
    @Override
    public double calculateFigureArea() {
        return a*b;
    }
    @Override
    public double calculateFigurePerimeter() {
        return 2*(a+b);
    }
}
