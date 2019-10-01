interface Nocturnal {
    String str = "N";
    default boolean isBlind() {
        return true;
    }
}

public class Test1 implements Nocturnal {
    String str = "T";
    public boolean isBlind() {
        return false;
    }

    public static void main(String[] args) {
        Nocturnal nocturnal = (Nocturnal) new Test1();
        System.out.println(nocturnal.isBlind()); //false
        System.out.println(nocturnal.str); //N
    }
}
//abstract class Nocturnal {
//    String str = "N";
//    protected boolean isBlind() {
//        return true;
//    }
//}

//public class Test1 extends Nocturnal {
//    public String str = "D";
//    public boolean isBlind() {
//        return false;
//    }
//
//    public static void main(String[] args) {
//        Nocturnal nocturnal = new Test1();
//        System.out.println(nocturnal.str);
//    }
//}