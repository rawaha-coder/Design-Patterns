package singleton.patterns.code;

public class Main {

    public static void main(String[] args) {

        System.out.println("***Singleton Pattern Code***\n");

        System.out.println("Trying to make a instance for our client");
        Singleton object1 = Singleton.getInstance();
        System.out.println("Trying to make another instance for our client");
        Singleton object2 = Singleton.getInstance();

        if (object1 == object2)
        {
            System.out.println("object1 and object2 are same instance");
        }

        System.out.println("\n***Test thread safe singleton class***\n");

        for (int i = 1; i <= 5; i++){
            new MyThread("Thread-" + i).start();
        }
    }

}
