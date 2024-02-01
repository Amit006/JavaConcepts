package generics;

public class Client {
    public static void main(String[] args) {
        Pair<Integer, String> PObj = new Pair<Integer, String>(2, "AMIT");
        Pair<String, String> PObj2 = new Pair<>("Amit", "Summit");

//      printing variable values
        System.out.println(PObj.getA() + " b: "+ PObj.getB());
        System.out.println(PObj2.getA() + " b: "+ PObj2.getB());

//      Using setter
        PObj.setA(300);
        PObj.setB("Chick");

        Object a = PObj.getA();
        Object  b = PObj.getB();

        System.out.println(" Object value:- "+ a +" -- "+ b);

        // rawTypes 
        //noinspection
        Pair pb = new Pair("Amit", 200);

        System.out.println(pb.getA() + " B: " + pb.getB());

    }
}

