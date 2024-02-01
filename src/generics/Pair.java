package generics;

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
}
