package lesson1;

import java.text.DecimalFormat;
import java.util.Arrays;

class MyGrades {
    int[] grades = new int[10];
    private int count;
    public MyGrades(int count){
        this.count = count;
    }
    public void fillGrades() {
        for (int i = 0; i < grades.length; i++) {
            grades[i] = 1 + (int) (Math.random() * 5);
        }
    }
    public float avarageGrade() throws Exception{
        int sum = 0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        //DecimalFormat df=new DecimalFormat("0.00");
        System.out.println(sum + ", " + this.count);
        if (this.count==0){
            throw new Exception("Devided by zero");
        }

        float value = Math.round(sum*100/this.count)/100f;
        return value;
    }

}

//throws обязательно когда исключение своё (!) и не обрабатывается в текущем методе, а потом
//СОЗДАТЬ СВОЕ ИСКЛЮЧЕНИЕ

public class Unit2 {
    public static void main(String... args) {
        MyGrades MyGrades1 = new MyGrades(0);
        MyGrades1.fillGrades();
        System.out.println(Arrays.toString(MyGrades1.grades));
        try{
            System.out.println(MyGrades1.avarageGrade());
        }
        catch (Exception e){
            System.out.println(e.getMessage());
            System.out.println("Обработали ошибку");
        }
        finally {
            System.out.println("И зашли в finally");
        }
    }
}

abstract class Cat {
    String name = "The Cat";
    static void clean(){};
}

class Lion extends Cat {
    static void clean(){} //статическая функция все равно не наследуется
}
