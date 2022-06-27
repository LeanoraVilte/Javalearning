import static java.lang.Math.abs;
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
        int mean = (a+b)/2;
        System.out.println("Среднеарифмтическое a и b равно " + mean);//begin 8 - в java 5/2 будет 2 (NotaBene!!!)

        int T = 2;
        int Y = 3;
        int G = T * Y;
        int O = (int) Math.sqrt(G);
        System.out.println("Среднегеометрическое a и b равно " + O);//begin 9 (под вопросом - некоторые значения считает неправильно)

        a = 6;
        b = 3;
        int sum = (a*a) + (b*b);
        int sub = (a*a) - (b*b);
        int mlt = (a*a) * (b*b);
        int div = (a*a) / (b*b);
        System.out.println(sum);//begin 10
        System.out.println(sub);//begin 10
        System.out.println(mlt);//begin 10
        System.out.println(div);//begin 10

        a = -6;
        b = -3;
        int sum1 = abs(a) + abs(b);
        int sub1 = abs(a) - abs(b);
        int mlt1 = abs(a) * abs(b);
        int div1 = abs(a) / abs(b);
        System.out.println(sum1);//begin 11
        System.out.println(sub1);//begin 11
        System.out.println(mlt1);//begin 11
        System.out.println(div1);//begin 11

        int tr0 = 3;
        int tr1 = 4;
        double gip = Math.sqrt((tr0*tr0)+(tr1*tr1));
        double per = tr0 + tr1 + gip;
        System.out.println(gip);//begin 12
        System.out.println(per);//begin 12

        int R1 = 3;
        int R2 = 2;
        double s1 = (R1*2)*p;
        double s2 = (R2*2)*p;
        double s3 = s1 - s2;
        System.out.println(s3);//begin 13
        System.out.println(s1);//для контроля
        System.out.println(s2);//для контроля

        double r1 = L/p/2;
        double sr1 = p * (r1*r1);
        System.out.println(r1);//begin 14
        System.out.println(sr1);//begin 14
        double c1 = sr1/25;
        System.out.println("Контроль: " + c1);//для контроля

        double S1 = 79.5;
        double S0 = S1/p;
        double D1 = Math.sqrt(S0)*2;
        System.out.println("Диаметр: " + D1);//Begin 15
        double L1 = D1*p;
        System.out.println("Длина окружности: " + L1);//Begin 15

        int x1 = 6;
        int x2 = 9;
        int x3 = Math.abs(x2 - x1);
        System.out.println("Расстояние: " + x3);//begin 16 - длина отрезка

        int x4 = 7;
        int x5 = 9;
        int x6 = 12;
        int AC = Math.abs(x6 - x4);
        int BC = Math.abs(x6 - x5);
        int ACBC = AC + BC;
        System.out.println("Cумма отрезков: " + ACBC);//begin 17

        x1 = 3;
        int y1 = 5;
        x2 = 8;
        int y2 = 1;
        int w1 = Math.abs(x2-x1);
        int l1 = Math.abs(y1-y2);
        int lp = w1*2 + l1*2;
        int sp = w1*l1;
        System.out.println("Длина периметра: " + lp);//begin 19
        System.out.println("Площадь: " + sp);//begin 19


    }
}



