<<<<<<< HEAD
package Curso_Java;

public class NumeroParOuImpar {

    static int ParOuImpar(int x) {
	if(x/2 == 0)
	{
		x = x/2;
		return x;
	}
	else
	{
		x= 3*x +1;
		return x;
	}
    }
	public static void main(String[] args) {
		int x = 13;
		while(x != 1)
		{
			if(x/2 == 0)
			{
			 x = NumeroParOuImpar.ParOuImpar(x);
			 System.out.println(x);
			}
			else
			{
			 x = NumeroParOuImpar.ParOuImpar(x);	
			 System.out.println(x);
			}
			
		}
		}
	}
=======
package Curso_Java;

public class NumeroParOuImpar {

    static int ParOuImpar(int x) {
	if(x/2 == 0)
	{
		x = x/2;
		return x;
	}
	else
	{
		x= 3*x +1;
		return x;
	}
    }
	public static void main(String[] args) {
		int x = 13;
		while(x != 1)
		{
			if(x/2 == 0)
			{
			 x = NumeroParOuImpar.ParOuImpar(x);
			 System.out.println(x);
			}
			else
			{
			 x = NumeroParOuImpar.ParOuImpar(x);	
			 System.out.println(x);
			}
			
		}
		}
	}
>>>>>>> 8a3526c26622fc2f070fbcdff95008fb8820a218
