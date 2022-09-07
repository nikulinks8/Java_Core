package org.lessons.lesson3;

public class Lesson3 {
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

    }
}
