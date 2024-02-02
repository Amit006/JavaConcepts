package generics;

import java.util.ArrayList;
import java.util.List;

public class Pair <T, V> {
    T a;
    V b;
    Pair(T a, V b){
        this.a = a;
        this.b = b;
    }

    void setA(T a){
        this.a = a;
    }
    void setB(V b){
        this.b = b;
    }

    T getA(){
        return this.a;
    }
    V getB(){
        return this.b;
    }

    //static methods
    static <E> void PrintRadius(E radius){
        System.out.println("Radius given :" + radius);
    }
    static <E> E ReturnRadius(E radius){
        return radius;
    }

    static <E> List<E> FindCircleAriaOfGeneric(E radius){
        List<E> list = new ArrayList<E>();
        list.add(radius);
        return list;
    }
    static <E extends  Number> double ReturnCircleAriaOfGeneric(E radius){
        return radius.floatValue() * radius.floatValue();
    }




}
