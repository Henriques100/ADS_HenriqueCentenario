package Curso_Java;

public class SomaNumeros1A1000 {
	public static void main(String[] args)
	   {
		int min = 1;
		int max = 1000;

		int soma = (min + max) * ((max - min + 1) / 2);
		System.out.println(soma);
	   }
	   }