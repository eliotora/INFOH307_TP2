public class Fibonacci {

    public int compute(int n) {
        if (n==0) return 0;
        else if (n==1) return 1;
        else {
            return this.compute(n-1) + this.compute(n-2);
        }
    }
}

