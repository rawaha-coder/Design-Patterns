package factory.method.patterns.code;

public abstract class IAnimalFactory {
    public abstract IAnimal
    GetAnimalType(String type) throws Exception;
}
