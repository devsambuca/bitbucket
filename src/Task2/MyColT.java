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

    private int valuecapacity;


    public MyColT() throws InvalidParamExeption {
        this(DEFAULT_CAPACITY);
    }

    public MyColT(int valuecapacity) throws InvalidParamExeption {
        if (valuecapacity > 0) {
            this.elementData = new Object[valuecapacity];

        } else if (valuecapacity == 0) {
            this.elementData = EMPTY_ELEMENTDATA;
        } else {
            try {
                throw new InvalidParamExeption("Illegal Capacity: "+
                        valuecapacity);
            } catch (InvalidParamExeption invalidParamExeption) {
                invalidParamExeption.myOwnException();
            }
        }
    }


    public MyColT(Collection c) {
        super(c);
    }

    @Override
    public boolean add(Object o){
            if (size() > elementData.length - 1 ) {
                remove(0);
                }
            return super.add(o);

    }

    public Object remove(int index) {
        return super.remove(index);
    }
}
