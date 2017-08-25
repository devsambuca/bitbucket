package Task2;

import javax.xml.bind.annotation.XmlType;
import java.io.IOException;

import static com.sun.xml.internal.fastinfoset.util.ValueArray.DEFAULT_CAPACITY;

/**
 * @author Fominykh Vladimir
 */
public class MyAppTwo {

    public static void main(String[] args) {
        MyColT mc2 = new MyColT(10);
        mc2.add(null);
        mc2.add(5);
        mc2.add(4);
        mc2.add(12);
        mc2.add(6);
        mc2.add(7);
        mc2.add(1);
        mc2.add(0);
        mc2.add(1);
        mc2.add(2);
        mc2.add(93);
        mc2.add(92);
        mc2.add(94);
        mc2.add(96);
        mc2.add(99);
        mc2.add(91);
        mc2.add(90);
        mc2.add(290);
        mc2.add(1901);
        mc2.add(1901);
        mc2.add(1901);
        mc2.add(1901);
        mc2.add(1901);
        mc2.add(1901);
        mc2.add(1901);
        mc2.add(1901);

        System.out.println(mc2);
        System.out.println(mc2.size());
    }
}


