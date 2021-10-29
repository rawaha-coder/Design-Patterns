package factory.method.patterns.code;

public class Main {

    public static void main(String[] args) {
        System.out.println("***Factory Pattern Demo***\n");
        IAnimalFactory animalFactory = new ConcreteFactory();
        IAnimal DuckType = null;
        try {
            DuckType = animalFactory.GetAnimalType("Duck");
        } catch (Exception e) {
            e.printStackTrace();
        }
        DuckType.Speak();
        IAnimal TigerType = null;
        try {
            TigerType = animalFactory.GetAnimalType("Tiger");
        } catch (Exception e) {
            e.printStackTrace();
        }
        TigerType.Speak();

        //There is no Lion type. So, an exception will be thrown
        IAnimal LionType = null;
        try {
            LionType = animalFactory.GetAnimalType("Lion");
        } catch (Exception e) {
            e.printStackTrace();
        }
        LionType.Speak();
    }
}
