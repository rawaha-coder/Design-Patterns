package adapter.patterns.code;

public class Calculator {
    Rectangle rectangle;
    public double getArea(Rectangle r)
    {
        rectangle = r;
        return rectangle.l * rectangle.w;
    }
}
