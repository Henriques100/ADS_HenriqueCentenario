package Curso_Java;

public class Fibonacci {
	static long fibo(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

	public static void main(String[] args) {
		for(int i = 0; i <= 12; i++)
		{
            System.out.print("(" + i + "):" + Fibonacci.fibo(i) + "\t");
		}
	}
}