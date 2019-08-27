package lesson1;

public class Unit1 {
    public static void main(String[] args) {
        B Value = new C();
        System.out.println(Value.returnMe());
    }
}
class B {
    int x;
    B( int n ) { x = n; } // a constructor
    int returnMe() { return x; }
}

class C extends B {
    C () { super(0); } // a constructor
    C (int n) { super(n); } // a constructor
}

//пример, показывающий //если нет конструктора по умолчанию и программа ругается на это
////в этом случае нужно в конструкторы потомка добавить super() с параметрами для конструктора предка