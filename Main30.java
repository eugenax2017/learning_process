public class Main30 {
    public static void main(String[] args) {
        Cosa2 Cosa = new Cosa2(3, "R");
        System.out.println(Cosa.value);
        Cosa1 Cosa8 = (Cosa1) Cosa;
        System.out.println(Cosa8.getClass());
        System.out.println(Cosa8.defineClass());
    }
}

class Cosa1 {
    int index;
    String value;
    public Cosa1() {this.value = "Super ";}
    public Cosa1(int index, String value){
        this.index = index;
        this.value += "Cosa1 ";
    }
    int defineClass(){
        return 1;
    }
}

class Cosa2 extends Cosa1 {
    public Cosa2(int index, String value){
        this.index = index;
        this.value += "Cosa2 ";
    }
    public int defineClass(){
        return 2;
    }
}