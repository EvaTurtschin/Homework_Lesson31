package homework;

public class Circle implements Shape{

    double a;
    double pi = 3.14;
    public Circle(double a){
        this.a = a;
    }
    @Override
    public double calculateFigureArea() {
        return pi*Math.pow(a,2);
    }
    @Override
    public double calculateFigurePerimeter() {
        return 2*pi*a;
    }
}
