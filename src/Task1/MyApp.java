package Task1;

/**
 * @author Fominykh Vladimir
 */
public class MyApp {
    public static void main(String[] args) {
        MyCollection mc = new MyCollection();
        MyCollection mc2 = new MyCollection(12);
        mc2.add(null);
        mc2.add(1);
        System.out.println(mc2);
        mc2.add(1);
        System.out.println(mc2);
        mc2.add(1);
        System.out.println(mc2);
        mc2.add(1);
        System.out.println(mc2);
        mc2.add(1);
        System.out.println(mc2);
        mc2.add(1);
        System.out.println(mc2);
        mc2.add(1);
        System.out.println(mc2);
        mc2.add(1);
        System.out.println(mc2);
        mc2.remove((Integer) 1);
        System.out.println(mc2);
        mc2.add(1);
        System.out.println(mc2);
        mc2.remove((Integer) 2);
        System.out.println(mc2);
        mc2.add(1);
        System.out.println(mc2);
        System.out.println(mc2.size());


        System.out.println();
        System.out.println();
        System.out.println();


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
        System.out.println(mc.size());



        System.out.println("value " + mc.getIndex(7));
        System.out.println("index " + mc.indexOf(-6));
        System.out.println("Average " + mc.getAverage());
        System.out.println("MAX " + mc.maxValue());
        System.out.println("MIN " + mc.minValue());
        System.out.println();
        System.out.println("value  " + mc2.getIndex(7));
        System.out.println("index " + mc2.indexOf(-6));
        System.out.println("Average 2 " + mc2.getAverage());
        System.out.println("MAX " + mc2.maxValue());
        System.out.println("MIN " + mc2.minValue());

    }
}
