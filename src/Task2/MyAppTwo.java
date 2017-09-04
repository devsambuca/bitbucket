package Task2;

import javax.xml.bind.annotation.XmlType;
import java.io.IOException;

import static com.sun.xml.internal.fastinfoset.util.ValueArray.DEFAULT_CAPACITY;

/**
 * @author Fominykh Vladimir
 */
public class MyAppTwo {

    public static void main(String[] args) throws InvalidParamExeption {
        MyColT mc1 = new MyColT(-6);
        MyColT mc2 = new MyColT();

        mc2.add(1);
        mc2.add(2);
        mc2.add(3);
        mc2.add(4);
        mc2.add(5);
        mc2.add(6);
        mc2.add(7);
        mc2.add(8);
        mc2.add(9);
        mc2.add(-10);
        mc2.add(11);
        mc2.add(12);
        mc2.add(13);
        mc2.add(14);
        mc2.add(15);
        mc2.add(16);
        mc2.add(17);
        mc2.add(18);
        mc2.add(19);
        mc2.add(20);

        System.out.println(mc2);
        System.out.println(mc2.size());
    }
}


