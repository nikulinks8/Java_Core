package org.lessons.lesson1;

import java.lang.reflect.Array;
import java.util.Arrays;

//Названия классов пишутся с заглавной буквы, тире и подчеркивания не допускаются. См. CamelCase
public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Hello world.");
//        Примитивные типы данных
//        Названия переменных со строчной буквы, разделители и спецсимволы не допускаются

/*
        ctrl+shift+/ комментирует выделенные строки - блок комментариев
*/
//        ctrl+/ комментирует одну строку
        boolean b1 = true;
        boolean b2 = false;
//      byte. Размер 1Б, [-128;127]
//        short = 2B, [-32768; 32767]
//        int = 4B, [-2147483648; 2147483647]
//        float = 32B или 7 знаков после запятой
//        long = 32B или 18 разрядов
//        double 16 разрядов после запятой
//        если после значения не указать l, f, d, то значение будет интерпретировано как int
        long long1 = 123456789012345678L;
        float f1 = 1.1234567f;
        double double1 = 1.1234567890123456d;

        System.out.println(long1);
        System.out.println(f1);
        System.out.println(double1);
//        ctrl+d - скопировать строку
//        % - остаток от деления. Например 5 % 2 = 1 потому, что нацело на 2 делится 4, а остаток 1.
//        char - символ. Можно указать значение явно в '' или номер символа в кодировке ANSII или KOI8
        char char1 = 'l';
        char char2 = 123;
        System.out.println(char1);

        char[] answer1 = new char[3];
        answer1[0] = 'х';
        answer1[1] = 'у';
        answer1[2] = 'й';
//        ввести sout и нажать tab
        System.out.println(answer1);

        char[] answer2 = {'a', 'b', 'c'};
        System.out.println(answer2);

        int[] numbers = {1,2,3};
        System.out.println(Arrays.toString(numbers));

//        текстовые данные
        String word1 = "Hello";
        String word2 = " world!";
//        конкатенация - объединение
        String result = word1 + word2;
        System.out.println(result);

        String stringFromCharArray = String.valueOf(answer2);
        System.out.println(stringFromCharArray + 'd');

//        Смена регистра
        System.out.println(word2.toUpperCase());
        System.out.println(word1.toLowerCase());
//        Длина строки
        System.out.println(result.length());
//        замена символов
        String newWord1 = word1.replace("lo", "icopter");
        System.out.println(newWord1);
//        повторение строки + знак переноса строки
        System.out.println((word1+'\n').repeat(10));
//        удаление пробелов слева и справа
        String word3 = "      trim      ";
        System.out.println(word3.trim());

/*
Работа с GitHub

Авторизация в GitHub.
File - Settings - Version control - "+" - Log In via GitHub, на странице https://account.jetbrains.com/github/oauth/intellij/complete нажать Authorize in GitHub

Создания репозитория.
VCS - Create Git Repository - выбрать папку проекта или package

Коммит (зафиксировать состояние файла).
Файл в панели слева Project - rmb - Git - Add - имя файла подсвечено зеленым
Git - Commit, в панели слева Commit выбрать файлы, написать комментарий к изменениям в поле снизу, нажать Commit.

Показать изменения по отношению к последнему коммиту.
Вкладка файла - rmb - Git - Show Diff, откроется вкладка с изменениями.

Отправить изменения в удаленный репозиторий на свой профиль в GitHub.
Git - GitHub - Share Project On GitHub
для последующих изменений
Git - Push
*/

    }
}
