package org.lessons.lesson3;

public class Lesson3 {
//    т.к. функция main объявлена статической, это значит, что для ее вызова не нужно создавать экземпляр класса Lesson3
    public static void main(String[] args) {
        Human human1 = new Human(43, 92, "Кирилл");
//      Серым подсвечиваются неиспользуемые элементы. Например, комментарий - он не участвует в компиляции кода.

        human1.getInfo();

//        После ввода human1.getWeightInPounds() нажать alt+enter и выбрать introduce local variable. Автоматически
//        будет создана строка ниже: тип и имя переменной, присваивание.
        int weightInPounds = human1.getWeightInPounds();
        System.out.println(weightInPounds + " - вес в фунтах");

        human1.setAge(44);
        System.out.println(human1);

//        создаем переменные cat1, 2 типа Cat, в которых хранится адрес экземпляров класса Cat
        Cat cat1 = new Cat(true);
        Cat cat2 = new Cat(false);
//        вызываем метод sayMeow по адресам, хранящимся в cat1, 2
        cat1.sayMeow();
        cat2.sayMeow();

        Plane plane1 = new Plane(20, 2);
        Plane plane2 = new Plane(10, 12);

        plane1.fly();
        plane2.fly();
    }
}
