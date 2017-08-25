package Task1;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Fominykh Vladimir
 */
 class MyCollection extends ArrayList<Integer> {

    public MyCollection(int initialCapacity) {
        super(initialCapacity);
    }

    public MyCollection() {
    }

    public MyCollection(Collection<? extends Integer> c) {
        super(c);
    }

    @Override
    public int indexOf(Object o) {
        return super.indexOf(o);
    }

    public int getIndex(int index) {
        return get(index);
    }


    /**
     * Appends the specified element to the end of this list.
     *
     * @param value element to be appended to this list
     * @return <tt>true</tt> (as specified by {@link Collection#add})
     */
    @Override
    public boolean add(Integer value) {
        if (value == null) throw new NullPointerException("Null pointer: " +
                value);
        else {
            for (int i = 0; i < size(); i++) {
                set(i, get(i) + value);
            }
            return super.add(value);
        }
    }

    public boolean remove(Integer value) {
        for (int j = 0; j < size(); j++) {
            set(j, get(j) - value);
        }
        return super.remove(value);
    }

    public double getAverage(){
        int sum = 0;
        double avg;
        for(int i = 0; i < size(); i++)
            sum += getIndex(i);
        avg = sum / size();
        return avg;
    }

    public int maxValue(){
        int max = 0;
            for(int i = 0; i < size(); i++) {
                if (getIndex(i) > max)
                    max = getIndex(i);
            }
            return max;
    }

    public int minValue(){
        int min = getIndex(0);
        for(int i = 0; i < size(); i++) {
            if (getIndex(i) < min)
                min = getIndex(i);
        }
        return min;
    }
}
