package Kirill.methodsimples;

import java.awt.*;
import java.lang.management.GarbageCollectorMXBean;
import java.util.Random;
import java.util.Scanner;

public class Simples1 {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        // System.out.println(randomSumm());
        // System.out.println(argument(21,5));
        //randomValueOf();
        System.out.println("Enter a value of : ");
        int r = in.nextInt();
        int g = in.nextInt();
        int b = in.nextInt();
        RGBtoCMYK(1,1,1);

    }

    /*
     Напишите программу, которая выводит сумму двух случайных чисел от 1 до
6 (такие результаты могут быть получены при броске кубиков).
      */
    private static int randomSumm() {
        int one = (int) (Math.random() * 6 + 1);
        int two = (int) (Math.random() * 6 + 1);
        return one + two;
    }

    /*
    Напишите программу, которая получает числа типа double х0, v0 и t в аргументах
  командной строки и выводит значение х0 + v0t - g t2/ 2, где g — константа
  9,80665. (Примечание: значение определяет путь в метрах, пройденный за t секунд
  брошенным вертикально вверх объектом, из исходной позиции х0 со скоростью
  v0 метров в секунду.)
     */
    private static int numberInput(int x, int v, int t) {
        final double g = 9.80665;
        return (int) (x + v * t - g * Math.pow(t, 2) / 2);
    }

    /*
    Напишите программу, которая получает два целых числа m и d в аргументах
командной строки и выводит true, если день d месяца m лежит в диапазоне от 20/03
до 20/06, или fa ls e в противном случае.
     */
    private static boolean argument(int m, int d) {
        if (m > 20 && d >= 3 && d < 6) {
            return true;
        } else {
            return false;
        }
    }

    /*
    Капитализация процентов. Напишите программу, которая вычисляет и выводит
сумму, которую вы получите через t лет при размещении Р долларов под
ежегодный процент г (непрерывно начисляемый). Искомое значение вычисляется
по формуле Реп.
     */
    private static int capitalProccent(int p, int e, int r, int t) {
        e = (int) (Math.pow(e, r) * Math.pow(e, t));
        int summ = p * e;

        return summ;
    }

    /*
    Полярные координаты. Напишите программу, которая
преобразует декартовы координаты в полярные. Ваша
программа должна получать два числа типа d o u b le в аргументах
командной строки и выводить полярные координаты
г и 0. Используйте метод Math.atan2(y, х) для вычисления
арктангенса величины у/х в диапазоне от - к до к.
     */
    private static double polarCoordinates(double x, double y) {
        double coordinate = Math.atan2(x, y);
        return coordinate;
    }

    /*
    Случайные числа с гауссовским (нормальным) распределением.
Напишите программу RandomGaussian для вывода случайного числа
г из гауссовского распределения. Для этого можно воспользоваться формулой
Бокса — Мюллера
г = sin(2 я v) (-2 In м)1/2,
где и и v — вещественные числа в диапазоне от 0 до 1, сгенерированные методом
Math.random().
     */
    private static double randomGussian(double v, double i) {

        double rndGuss = Math.sin(2 * Math.PI * v) * Math.pow(-2 * Math.log(i), 0.5);
        return rndGuss;
    }

    /*
    Проверка упорядоченности. Напишите программу, которая получает три
числа типа double х, у и z в аргументах командной строки и выводит true, если
значения расположены строго по возрастанию или убыванию ( х < у < z или
х> у> z ), или fa ls e в противном случае.
     */
    private static boolean orderlinessCheck(double x, double y, double z) {
        if (x > y && y > z) {
            return true;
        } else {
            return false;
        }
    }

    /*
    День недели. Напишите программу, которая получает дату и выводит день
недели, на который приходится эта дата. Ваша программа должна получать три
значения типа in t в аргументах командной строки: m (месяц), d (день) и у (год).
Значение m равно 1 для января, 2 — для февраля и т. д. Программа выводит 0 для
воскресенья, 1 — для понедельника, 2 — для вторника и т. д. Вычисление выполняется
по следующим формулам из григорианского календаря:
Уо = У ~ (1^ - от) / 12
х = У0 + Уо/4 ~Уо/ЮО + г/о/400
т 0 = m + 12 х ((14 - /и) / 12) - 2
d0 = (d + х+ (31 х т0) / 12) % 7
Пример: на какой день недели приходится 14 февраля 2000 года?
у0 = 2000 - 1 = 1999
х = 1999 + 1999 / 4 - 1999 / 100 + 1999 / 400 = 2483
т 0 = 2 + 12 х 1 - 2 = 12
d0 = (14 + 2483 + (31 х 12) / 12) % 7 = 2500 % 7 = 1
Ответ: понедельник.
     */
    private static int day(int m, int d, int y) {
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;
        return d0;
    }

    /*
    Случайные числа с равномерным распределением. Напишите программу, которая
выводит пять случайных чисел с равномерным распределением в диапазоне
от 0 до 1, их среднее арифметическое, минимальное и максимальное значения.
Используйте методы Math.randomQ, Math.minQ и Math.maxQ.
     */
    private static void randomValueOf() {

        double[] e = new double[5];
        double min = 0;
        double max = 0;
        for (int i = 0; i < e.length - 1; i++) {
            min = e[0];
            max = e[0];
            e[i] = Math.random();
            if (min > e[i]) {
                min = e[i];
            }
            if (max < e[i]) {
                max = e[i];
            }

            System.out.println(e[i]);
        }
        System.out.println("min " + min + " max " + max);
    }

    /*
Проекция Меркатора. Проекция Меркатора представляет собой равноугольную
(сохраняющую углы между направлениями) картографическую проекцию,
отображающую широту ф и долготу X в прямоугольные координаты (х, у).
Проекция Меркатора широко применяется — например, в навигационных картах
и тех картах, которые вы распечатываете из Интернета. Проекция определяется
формулами х = X - Xq и у = 1/2 In ((1 + sin ф) / (1 - sin ф)), где Xq — долгота точки
в центре карты. Напишите программу, которая получает в командной строке ^0,
а также широту и долготу точки и выводит проекцию точки.
 */
    private static double coordinateX(double l, double l0) {
        double x;
        return x = l - l0;
    }

    private static double coordinateY(double f) {

        return 1 / 2 * Math.log((1 + Math.sin(f)) / (1 - Math.sin(f)));

    }

    /*
    Преобразование цветов. Для представления цвета используются несколько
   разных форматов. Например, RGB — основной формат для ЖК-экранов, цифровых
   камер и веб-страниц — задает интенсивность красной (R), зеленой (G)
   и синей (В) цветовой составляющей в диапазоне от 0 до 255. В полиграфии чаще
   всего используется формат CMYK, определяющий уровень голубого (С), малинового
   (М), желтого (Y) и черного (К) цветов по вещественной шкале от 0,0 до
   1,0. Напишите программу RGBtoCMYK, преобразующую значение RGB в CMYK.
   Программа получает в командной строке три целых числа г , g и b и выводит
   эквивалентные значения в формате CMYK. Если все компоненты RGB равны
   0, то все значения CMY равны 0, а значение К равно 1; в остальных случаях используются
   следующие формулы:
   w = max ( г / 255, g / 255, Ь / 255 )
   с = (w - ( г / 255)) / w
   m = (w - ( g / 255)) / w
   у = (w - ( b / 255)) / w
   k = 1 - w
     */
    private static void RGBtoCMYK(int r, int g, int b) {

        double k;
        double c;
        double m;
        double y;

            if (r >= 0 && r <= 255 && g >= 0 && g <= 255 && b >= 0 && b <= 255) {

                if (r == 0 && g == 0 && b == 0) {
                    c = 0;
                    m = 0;
                    y = 0;
                    k = 1;

                } else {
                    System.out.println("Equivalents values ");
                    double w = Math.max(r / 255, Math.max(g / 255, b / 255));
                    c = (w - (r / 255)) / w;
                    m = (w - (g / 255)) / w;
                    y = (w - (b / 255)) / w;
                    k = 1 - w;

                }
            } else {
                System.out.println("you entered the wrong number: ");
                System.out.println();


            }

        }

    }

