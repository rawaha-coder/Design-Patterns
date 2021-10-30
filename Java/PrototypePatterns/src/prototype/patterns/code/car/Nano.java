package prototype.patterns.code.car;

public class Nano extends BasicCar{
    public Nano(String m)
    {
        modelName = m;
    }
    @Override
    public BasicCar clone() throws CloneNotSupportedException
    {
        return (Nano)super.clone();
    }
}
