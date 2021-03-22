package by.it.kaminskii.jd01_01;

import java.util.Scanner;

/*
Ускорение свободного падения на Земле и Марсе таково:
Марс   3.86
Земля   9.81

С клавиатуры вводится вес человека в килограммах.
Рассчитайте вес человека на Марсе и выведите
округлив его до сотых килограмма (2 знака)

Создайте для этих целей метод getWeight(int weight)

Требования:
1.  Метод getWeight(int weight) должен быть статическим.
2.  Метод getWeight должен возвращать значение типа double.
3.  Метод getWeight должен ОБЯЗАТЕЛЬНО округлять до сотых возвращаемое значение
    типа double внутри самого метода.
4.  Метод getWeight не должен ничего выводить на экран.
5.  Метод getWeight должен правильно переводить вес тела в килограммах на Земле
    в вес этого же тела на Марсе, и возвращать это значение.
6.  Если получится, то пока не используйте в getWeight методы стандартной библиотеки
    (round, ceil, printf, format, и т.п). Возможностей самого языка вполне достаточно.

Пример:

Ввод:
75

Вывод:
29.51

*/
class TaskC3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int we = sc.nextInt();
        double wm = getWeight(we);

        System.out.println(wm);
    }

    private static double getWeight(int we) {

        final double GE = 9.81;
        final double GM = 3.86;
        double wm = we / GE * GM;
        int we100 = (int) (wm * 100);
        if (wm * 100 - we100 < 0.5) {
            return we100 / 100.00;
        } else
            return (we100 + 1) / 100.00;

    }
}


