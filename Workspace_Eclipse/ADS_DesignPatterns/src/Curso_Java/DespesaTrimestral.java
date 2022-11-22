package Curso_Java;

public class DespesaTrimestral 
{
	public static void main(String[] args)
	   {
	   int despesaJaneiro = 15000;
	   int despesaFevereiro = 23000;
	   int despesaMarco = 17000;
	   float media = (despesaJaneiro+despesaFevereiro+despesaMarco)/3;
	   int total = despesaJaneiro+despesaFevereiro+despesaMarco; 
	   System.out.println("Média da despesa no trimestre: "+ media + "\n" +
			                  "Total de gastos no trimestre:"+total);
       }
}

