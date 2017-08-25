package Task1;

import java.util.ArrayList;

/**
 * @author Fominykh Vladimir
 */
 class MyCollection extends ArrayList<Integer> {


    @Override
    public int indexOf(Object o) {
        return super.indexOf(o);
    }

    public int getIndex(int index) {
        return get(index);
    }

    @Override
    public boolean add(Integer value) {
        for (int i = 0; i < size(); i++) {
            set(i, get(i) + value);
        }
        return super.add(value);
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
