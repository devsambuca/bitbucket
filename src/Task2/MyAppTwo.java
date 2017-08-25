package Task2;

import javax.xml.bind.annotation.XmlType;
import java.io.IOException;

import static com.sun.xml.internal.fastinfoset.util.ValueArray.DEFAULT_CAPACITY;

/**
 * @author Fominykh Vladimir
 */
public class MyAppTwo {

    public static void main(String[] args) {
        MyColT mc2 = new MyColT();

        mc2.add(null);
        mc2.add(5);
        mc2.add(4);
        mc2.add(12);
        mc2.add(6);
        mc2.add(7);
        mc2.add(1);
        mc2.add(9);
        mc2.add(9);
        mc2.add(9);
        mc2.add(9);
        mc2.add(9);
        mc2.add(9);
        mc2.add(9);
        mc2.add(9);
        mc2.add(9);
        mc2.add(9);

        System.out.println(mc2);
        System.out.println(mc2.size());
    }
}


       /* char choice, ignore;
        Select mct = new Select();
        for (; ; ) {
            do {
                mct.showmenu();

                    choice = (char)
                            System.in.read();
                do {
                        ignore = (char)
                                System.in.read();
                } while (ignore != '\n') ;
                } while (!mct.isvalid(choice));

                if (choice == 'q') break;

                System.out.println("\n");

                mct.helpon(choice);
            }
        }
    }*/





