package generics;

import java.util.HashSet;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //noinspection
        Pair<Integer, String> PObj = new Pair<Integer, String>(2, "AMIT");
        Pair<String, String> PObj2 = new Pair<>("Amit", "Summit");

        //printing variable values
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

        int i = 40;
        List<Integer> CircleAria = Pair.FindCircleAriaOfGeneric(i);
        System.out.println(" List : "+ CircleAria);

        //Implementation of PointerClass
        HashSet<Point> pointSet = new HashSet<>();

        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        Point point3 = new Point(1, 2); // Duplicate of point1

        pointSet.add(point1);
        pointSet.add(point2);
        pointSet.add(point3); // This should not be added to the set due to proper equals and hashCode implementation

        System.out.println("Size of HashSet: " + pointSet.size()); // Should print 2
//      System.out.println("Equals of HashSet: " + pointSet.size()); // Should print 2


        //Collections and Generics - Coding Question 3
        Node node3 = new Node(3, null);
        Node node2 = new Node(2, node3);
        Node node1 = new Node(1, node2);

        // Using the enhanced for loop
        for (Node node : node1) {
            System.out.println(node.getData());
        }

    }
}

