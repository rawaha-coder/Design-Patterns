package facade.patterns.code.robotparts;

public class RobotColor {
    private String color;
    public void SetColor(String color)
    {
        this.color = color;
        System.out.println("Color is set to : "+ this.color);
    }
}
