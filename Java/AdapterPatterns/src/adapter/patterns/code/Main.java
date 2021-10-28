package adapter.patterns.code;

public class Main {

    public static void main(String[] args) {
        System.out.println("***Adapter Pattern Code***");
        CalculatorAdapter cal = new CalculatorAdapter();
        Triangle t = new Triangle(20,10);
        System.out.println("\nAdapter Pattern Example\n");
        System.out.println("Area of Triangle is :" + cal.getArea(t));
    }
}
