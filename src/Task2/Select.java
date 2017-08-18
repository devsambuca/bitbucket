package Task2;

/**
 * @author Fominykh Vladimir
 */
class Select {

    boolean isvalid(int ch){
        if(ch < '1' | ch > '7' & ch !='q')
            return false;
        else
            return true;
    }

    void helpon(int what) {
        switch (what) {
            case '1':
                System.out.println("По умолчанию");
                break;
            case '2':

                System.out.println("Фиксированной длины");

                break;
        }
        System.out.println();
    }
    void showmenu() {
        System.out.println("Выбор размера:");
        System.out.println("1. по умолчанию");
        System.out.println("2. фиксированный\n");
        System.out.println("Выберите q to exit");

    }


}
