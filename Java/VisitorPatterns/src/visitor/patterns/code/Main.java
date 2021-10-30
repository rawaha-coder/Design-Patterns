package visitor.patterns.code;

public class Main {

    public static void main(String[] args) {
        System.out.println("\n***Visitor Pattern Demo***\n");
        IVisitor v = new Visitor();
        MyClass myClass = new MyClass();
        myClass.accept(v);
    }
}
