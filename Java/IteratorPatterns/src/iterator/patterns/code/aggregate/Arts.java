package iterator.patterns.code.aggregate;

import iterator.patterns.code.iterator.IIterator;

public class Arts implements ISubject{
    private String[] subjects;
    public Arts()
    {
        subjects = new String[3];
        subjects[0] = "Spanish";
        subjects[1] = "English" ;
        subjects[2] = "Arabic" ;
    }

    @Override
    public IIterator CreateIterator() {
        return new ArtsIterator(subjects);
    }

    public class ArtsIterator implements IIterator{

        private String[] subjects;
        private int position;
        public ArtsIterator(String[] subjects)
        {
            this.subjects = subjects;
            position = 0;
        }

        @Override
        public String Next() {
            return subjects[position++];
        }

        @Override
        public Boolean hasNext() {
            return position >= subjects.length;
        }
    }
}
