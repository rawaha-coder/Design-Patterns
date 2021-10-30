package prototype.patterns.code.car;

public class Ford extends BasicCar{
    public Ford(String m)
    {
        modelName = m;
    }
    @Override
    public BasicCar clone() throws CloneNotSupportedException
    {
        return (Ford)super.clone();
    }
}
