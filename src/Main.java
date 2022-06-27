import static java.lang.System.*;

public class Main {
    public static <string, str> void main(String[] args) {
        String A = "Hello ";
        String B = "New ";
        String C = "World!";

        System.out.println(A + B + C);//конкантенация строк

        int d, f, e;
        d = 1;
        f = 3;
        e = d + f;
        System.out.println(e);//математика: суммирование

        d = 6;
        f = 4;
        int w = d*f;
        System.out.println(w);//математика: умножение

        A = "your name " +
                " ";
        d = 42;
        System.out.println(A + d);//контантенация: строка + число

        int x = 8;
        int y = x*x;
        System.out.println(y);//begin2 - первый вариант

        int l = 9;
        int j = 2;
        System.out.println("Площадь квадрата равна " + Math.pow(l, j));//begin2 - второй вариант

        int r = 100;
        int length = r*4;
        System.out.println("Длина сторон квадрата равна " + length);//begin 1

        l = 5;
        j = 10;
        int s = l*j;
        length = (l + j)*2;
        System.out.println("Площадь прямоугольника равна " + s);
        System.out.println("Длина длин сторон прямоугольника равна " + length);//begin 3

        double p = 3.14;
        int D = 3;
        double L = p*D;
        System.out.println("Длина окружности равна " + L);//begin 4

        l = 4;
        int v = l*l*l;
        s = 6* (l*l);
        System.out.println("Длина сторон куба равна " + s);//begin 5
        System.out.println("Объем куба равен " + v);//begin 5

        int a, b, c;
        a = 2;
        b = 3;
        c = 5;
        v = a*b*c;
        s = 2*(a*b + b*c + a*c);
        System.out.println("Длина сторон параллелипипеда равна " + s);//begin 6
        System.out.println("Объем параллелипипеда равен " + v);//begin 6

        r = 5;
        L = p*(r*2);
        double S = p*(r*r);
        System.out.println("Длина окружности равна " + L);//begin 7
        System.out.println("Площадь круга равна " + S);//begin 7

        a = 6;
        b = 4;
        double mean = (a+b)/2;
        System.out.println("Среднеарифмтическое a и b равно " + mean);//begin 8
    }
}



