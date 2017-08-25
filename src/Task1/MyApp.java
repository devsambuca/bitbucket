package Task1;

/**
 * @author Fominykh Vladimir
 */
public class MyApp {
    public static void main(String[] args) {
        MyCollection mc = new MyCollection();
        MyCollection mc2 = new MyCollection(12);
        mc2.add(1);
        mc2.add(1);
        mc2.add(1);
        mc2.add(1);
        mc2.add(1);
        mc2.add(1);
        mc2.add(1);
        mc2.add(1);
        mc2.add(1);
        mc2.add(1);
        mc2.add(1);
        mc2.add(1);
        mc2.add(1);
        System.out.println(mc2.size());



        mc.add(12);
        System.out.println(mc);
        mc.add(5);
        System.out.println(mc);
        mc.add(1);
        System.out.println(mc);
        mc.add(1);
        System.out.println(mc);
        mc.add(2);
        System.out.println(mc);
        mc.remove((Integer)22);
        System.out.println(mc);
        mc.add(3);
        System.out.println(mc);
        mc.add(3);
        System.out.println(mc);
        mc.add(1);
        System.out.println(mc);
        System.out.println(mc2.size());



        System.out.println("value " + mc.getIndex(7));
        System.out.println("index " + mc.indexOf(-6));
        System.out.println("Average " + mc.getAverage());
        System.out.println("MAX " + mc.maxValue());
        System.out.println("MIN " + mc.minValue());

    }
}
