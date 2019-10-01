
class MyExeptionNew extends Error {
    static int count=0;

    public MyExeptionNew () {
        this.count++;
        printMyExeption();
    }

    public void printMyExeption(){
        System.out.println("Exception! "+count);
    }
}


public class Main40 {
    public static void main(String[] args) {
        try {
            if (1==1) {
                throw new MyExeptionNew();
            }
        } catch (MyExeptionNew e ) {
            e.printMyExeption();
        }
    }
}
