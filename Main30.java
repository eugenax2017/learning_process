//если нет конструктора по умолчанию и программа ругается на это
//в этом случае нужно в конструкторы потомка добавить super() с параметрами для конструктора предка

import java.io.IOException;

public class Main30 {
    public static void main(String[] args) throws IOException {
        Cosa2 Cosa = new Cosa2(3);
        System.out.println(Cosa.value);
        Cosa1 Cosa8 = (Cosa1) Cosa;
        System.out.println(Cosa8.getClass());
        System.out.println(Cosa8.defineClass());
    }
}

class Cosa1 {
    int index;
    String value;
    //public Cosa1() {this.value = "Super ";}
    public Cosa1(int index){
        this.index = index;
        this.value += "Cosa1 ";
    }
    int defineClass(){
        return 1;
    }
}

class Cosa2 extends Cosa1 {
    public Cosa2(){ super(0);}
    public Cosa2(int index) {
        super(index);
        //this.index = index;
        this.value += "Cosa2 ";
    }
    public int defineClass(){
        return 2;
    }
}
