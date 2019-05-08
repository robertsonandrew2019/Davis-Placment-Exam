public class Main {

    public static void main(String[] args) {
        //call methods here
    }

    static void nestedIfs(int x) {
        if (x > 10) {
            System.out.println(1);
            if (x > 20) System.out.println(2);
            if (x > 30) System.out.println(3);
            else System.out.println(4);
        }
        else {
            if (x > 5) System.out.println(5);
            else {
                if (x > 8) System.out.println(6);
                else System.out.println(7);
            }
        }
        System.out.println();
    }

    static int basicWhile(int y) {
        int s = 0; int x = 0;
        while (x < y) {
            s += x;
            x++;
        }
        return s;
    }

    static int basicWhileIf() {
        int total = 0;
        int number = 1;
        while (number < 7) {
            if ((number >= 3) && (number <= 5)) total += number;
            number++;
        }
        return total;
    }

    static int nestedLoops(int a, int b) {
        int c;
        if (a < 0) a = -a;
        if (b < 0) b = -b;

        while (b > 0) {
            while (b <= a) a -= b;
            c = a;
            a = b;
            b = c;
        }
        return a;
    }
}
