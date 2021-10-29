package iterator.patterns.code.aggregate;

import iterator.patterns.code.iterator.IIterator;

import java.util.LinkedList;

public class Science implements ISubject{
    private LinkedList<String> subjects;
    public Science()
    {
        subjects = new LinkedList<String>();
        subjects.addLast("Maths");
        subjects.addLast("Computer Science");
        subjects.addLast("Physics");
    }
    @Override
    public IIterator CreateIterator() {
        return new ScienceIterator(subjects);
    }

    public class ScienceIterator implements IIterator{

        private LinkedList<String> subjects;
        private int position;
        public ScienceIterator(LinkedList<String> subjects)
        {
            this.subjects = subjects;
            position = 0;
        }

        @Override
        public String Next() {
            return subjects.get(position++);
        }

        @Override
        public Boolean hasNext() {
            return position >= subjects.size();
        }
    }
}
