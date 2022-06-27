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
        System.out.println("L в квадрате равно " + Math.pow(l, j));//begin2 - второй вариант

        int begin1 = 100;
        int length = begin1*4;
        System.out.println(length);
    }
}



