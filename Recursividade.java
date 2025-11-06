//Recursividade
public class Main
{
	public static void main(String[] args) 
	{
	   int [] a  = {5,7,3,2,4,8};

		System.out.println("Fatorial de 5! = "+fatorial(5));
		System.out.println("Fatorial de 0! = "+fatorial(0));
        System.out.println("Potência de 2^2 = "+exponencial(2,2));
        System.out.println("Potência de 2^5 = "+exponencial(2,5));
        System.out.println("Soma elementos Array A = "+soma(a, a.length-1));
        System.out.println("MDC 12 e 16 = "+mdc(12,16));
        System.out.println("MDC 5 e 15 = "+mdc(5,15));
        System.out.println("MDC 18 e 60 = "+mdc(18,60));
        System.out.println();
        System.out.print("\nFibonacci: "+"[ "+fibonacci(0)+" ");
        System.out.print(fibonacci(1)+" ");
        System.out.print(fibonacci(2)+" ");
        System.out.print(fibonacci(3)+" ");
        System.out.print(fibonacci(4)+" ");
        System.out.print(fibonacci(5)+" ");
        System.out.print(fibonacci(6)+" ]\n");
        System.out.println("Somatória de 3: "+ somatoria(3));
        System.out.println("Soma de pares: "+ somaPar(4));
        System.out.println("Soma de impares: "+ somaImpar(5));
        
        System.out.println("Múltiplos de três: "+multiploTres(a, a.length-1));



	}

    //Exercício  de calcular o fatorial 
    public static int fatorial (int num)
    {
        if(num==0) //Se o número for igual a 0 irá retornar 1 
        {
            return 1;
        }
        return num * fatorial(num-1); //Se o número for maior que 0
    }
    
    
    //Exercício 3 de calcular a potência
    public static int exponencial(int x, int num)
	{
	    if(num==0)
	    {
	        return 1;
	    }
	    return x * exponencial(x,num-1);
	}
	
	
	//Exercício 4 de calcular a soma do indíce do array
	public static int soma(int [] a, int n)
	{
        if(n==0)
        {
            return a[0];      
        }
        
        return a[n] + soma(a,n-1); 

	}
	
	
	//Exercício 6 de calcular o mdc
	public static int mdc(int a,int b)
	{
	    if(b == 0)
	    {
	        return a;
	    }
	
	    return mdc(b, a%b);
	}
	
	
	//Sequência de Fibonacci
	public static int fibonacci(int n)
	{
	    if(n == 0 || n == 1)
	    {
	        return n;
	    }
	    return fibonacci(n-1)+fibonacci(n-2);
	}
	
	
	//Exercício 8 imprimir multiplos de três
	public static int multiploTres(int[] a, int indice)
    {
        if(indice < 0)
        {
          return 0;
        }

        if(a[indice] % 3 == 0)
        {
            return a[indice] + multiploTres(a,indice-1) ;
        }
        
        else
         return multiploTres(a,indice-1);
        
    }

	
	//Exercício 9 somatória de 1 a n
	public static int somatoria(int num)
	{
	    if(num <=0)//Para parar a recursão
	    {
	        return num;
	    }

        return num + somatoria(num-1);
	}
	
    //Exercício 9 somar pares
    public static int somaPar(int num)
    {
        if(num<=0)
        {
            return 0;
        }
        
            if(num%2==0) //Se for par ele irá somar 
            {
                return num + somaPar(num-2);
            }
                
                else//Senão ele não vai somar nada
                {
                    return somaPar(num - 1);
                }
    }
    
    
    //Exercício 9 somar impares
    public static int somaImpar(int num)
    {
        if(num<=0)
        {
            return 0;
        }
        
            if(num%2!=0) //Se for par ele irá somar 
            {
                return num + somaImpar(num-1);
            }
                
                else//Senão ele não vai somar nada
                {
                    return somaImpar(num - 1);
                }
    }
    
    
}


/*

id    num   chamada             operação            retorno
0     5                                             120
1     5     fatorial(5-1)       5*fatorial(5-1)     5*24⬏
2     4     fatorial(4-1)       4*fatorial(4-1)     6*4 ⬏
3     3     fatorial(3-1)       3*fatorial(3-1)     3*2 ⬏
4     2     fatorial(2-1)       2*fatorial(2-1)     2*1⬏ 
5     1     fatorial(1-1)       1*fatorial(1-1)     1*1 está retornando para o anterior ⬏ 
6     0         -               1





Fibo(3)
        2          1
Fibo (3-1) + Fibo(3-2)
  |               |
<-                -> return 1;
 

Fibo(2-1) + Fibo(2-2) 
  |               |
<-                -> return 0;
retur 1;
*/