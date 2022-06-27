import static java.lang.System.*;

public class Main {
    public static <string, str> void main(String[] args) {
        String a = "Hello ";
        String b = "New ";
        String c = "World!";

        System.out.println(a + b + c);//конкантенация строк

        int d, f, e;
        d = 1;
        f = 3;
        e = d + f;
        System.out.println(e);//математика: суммирование

        d = 6;
        f = 4;
        int w = d*f;
        System.out.println(w);//математика: умножение

        a = "your name " +
                " ";
        d = 42;
        System.out.println(a + d);//контантенация: строка + число

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

    }
}



