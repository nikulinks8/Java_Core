package org.lessons.lesson3;

public class Human {
//    по умолчанию примитивным типам данных присваивается значение 0, для остальных типов значение null
    private int age;
    private int weight;
    private String name;

//    имя конструктора совпадает с именем класса, также начинается с верхнего регистра, но за именем следуют круглые
//    скобки - признак функции
//    если конструктор явно не определен, то неявно срабатывает такой конструктор public Human(){}
    public Human(int humanAge, int humanWeight, String humanName){
//        свойству age экземпляра этого (this.) класса присвоить значение, переданное в конструктор, при создании
//        экземпляра этого класса. Т.е. запись this.age = humanAge эквивалентна human1.age = humanAge
        this.age = humanAge;
        this.weight = humanWeight;
        this.name = humanName;
    }

    public void getInfo(){
        System.out.println(this.age);
        System.out.println(this.weight);
        System.out.println(this.name);
    }

    public int getWeightInPounds(){
        return this.weight * 2;
    }
    public void setAge(int newHumanAge){
        this.age = newHumanAge;
    }



//    alt+Ins - открывает окно автоматической вставки переопределения функции
//    функция toString класса String переопределена для использования с экземплярами класса Human. При выводе на экран
//    экземпляра класса Human в аргументах неявно передается human1.toString(). Поэтому функция нуждается в
//    переопределении.

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                '}';
    }
}
