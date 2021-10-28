package adapter.patterns.code;

public class CalculatorAdapter {
    Calculator calculator;
    Triangle triangle;
    public double getArea(Triangle t)
    {
        calculator = new Calculator();
        triangle = t;
        Rectangle r = new Rectangle();

        //Area of Triangle=0.5*base*height
        r.l = triangle.b;
        r.w = 0.5*triangle.h;
        return calculator.getArea(r);
    }
}
