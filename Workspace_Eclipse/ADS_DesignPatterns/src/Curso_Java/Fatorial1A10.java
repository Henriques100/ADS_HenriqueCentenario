package Curso_Java;

public class Fatorial1A10 {
	public static void main(String[] args)
	   {
		double fatorial = 1;
		/*
		int soma = 1;
		while(soma >=1 && soma<=10)
		{
			fatorial = fatorial * soma;
			soma++;
			System.out.println(fatorial);
		}
		*/
		for(double n=1; n<=40; n++)
		{
			fatorial = fatorial * n;
			System.out.println("O fatorial de "+ n + " é igual a "+fatorial);
		}
		
	   }
}
