package iterator.patterns.code;

import iterator.patterns.code.aggregate.*;
import iterator.patterns.code.iterator.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("***Iterator Pattern Demo***\n");
        ISubject Sc_subject = new Science();
        ISubject Ar_subjects = new Arts();
        IIterator Sc_iterator = Sc_subject.CreateIterator();
        IIterator Ar_iterator = Ar_subjects.CreateIterator();
        System.out.println("\nScience subjects :");
        Print(Sc_iterator);
        System.out.println("\nArts subjects :");
        Print(Ar_iterator);
    }

    public static void Print(IIterator iterator)
    {
        while (!iterator.hasNext())
        {
            System.out.println(iterator.Next());
        }
    }
}
