public class Ex1 {

    public int divisible(int a, int b, int c) {
        if (a%b == 0 && a%c == 0) return b+c;
        else if (a%b == 0) return b;
        else if (a%c == 0) return c;
        else return 0;
    }
}
