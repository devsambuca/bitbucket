package Task2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author Fominykh Vladimir
 */
public class MyColT  extends ArrayList{
    private static final int DEFAULT_CAPACITY = 16;
    private Object[] elementData= {};
    private static final Object[] EMPTY_ELEMENTDATA = {};
    private int defaultCapacity;
    private int valuecapacity;
    private int size;

    public MyColT() {
        this(DEFAULT_CAPACITY);
    }

    public MyColT(int valuecapacity) {
        if (valuecapacity > 0) {
            this.elementData = new Object[valuecapacity];

        } else if (valuecapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("Illegal Capacity: "+
                    valuecapacity);
        }
    }


    public MyColT(Collection c) {
        super(c);
    }

    @Override
    public boolean add(Object o){
            if ((indexOf(o)) > valuecapacity) {
                remove(0);
                }


            return super.add(o);

    }

    public Object remove(int index) {
        return super.remove(index);
    }
}
