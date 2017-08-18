package Task2;

import java.io.IOException;

/**
 * @author Fominykh Vladimir
 */
public class MyAppTwo  {

    public static void main(String[] args) throws IOException {
        char choice, ignore;
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
    }





