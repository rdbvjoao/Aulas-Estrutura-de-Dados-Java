public class Main
{
	public static void main(String[] args) 
	{
        int [] array = {7,8,9,6,3,2,5,3,-10}; 
        int [] arrayOrdenado = {5,23,27,30,39,45,56,71,80,92};
        
        System.out.println("Soma elementos do array = "+soma(array, array.length-1));
        System.out.println("Múltiplos de três: "+multiploTres(array, array.length-1));
	    
	    
	    //Exercicio 9
	    System.out.println("");

	    System.out.println("Soma de pares de 1 até n: "+ somaPar(7));
	    System.out.println("Soma de ímpares de 1 até n: "+ somaImpar(7));
	    
	   //Exercício 10
	   System.out.println("");
	   System.out.print("Decimal 12 para binário = ");  dec2Bin(12);
	   
	   System.out.println("");
	   System.out.println("Concatenação: "+decToBin(12));
	   
	   //Exercício buscaBinaria 29.09
	   System.out.println("");
       System.out.println("Posição buscaBinaria: "+ buscaBinaria(arrayOrdenado,0,array.length-1,80));
        
        System.out.println("Posição buscaBinariaRecursiva: "+ buscaBinariaRecursiva(arrayOrdenado,0,array.length-1,80));

	    
	}
    
    public static int soma(int[] array, int indice)
    {
        if(indice==0)
        {
            return array[0];
        }
        return array[indice] + soma(array, indice-1);
    }
    
    
    public static int multiploTres(int[] array, int indice)
    {
        if(indice < 0)
        {
          return 0;
        }

        if(array[indice] % 3 == 0)
        {
            return array[indice] + multiploTres(array,indice-1) ;
        }
        
        else
         return multiploTres(array,indice-1);
        
    }
    
    
    //Exercício 9 para fazer somatoria de 1 a n
    public static int soma(int num)
    {
        if(num == 1)
        {
            return num;
        }
            return num + soma(num-1);
    }
    
    //Método de  somaPar
    public static int somaPar(int num)
    {
        if (num == 0)
            return 0;
    
        
        if(num % 2 == 0)
            return num + somaPar(num-1);
        
        else 
            return somaPar(num-1);
    }
    
    
    //Método de somaImpar
    public static int somaImpar(int num)
    {
        if (num == 0)
            return 0;
        
        
        if(num %2 != 0)
            return num + somaImpar(num-1);
        
        else 
            return somaImpar(num-1);
    }
    
    
    
    
    //Exercício 10 - Conversão de decimais para binários
    public static void dec2Bin(int n)
    {
        if(n == 0 || n == 1) //quando o número for 0 ele não irá retornar nada
        {
            System.out.print(n);
            return;
        }

        dec2Bin(n/2); //chamando o método recursivo 
        
        System.out.print(n % 2); //imprimindo resto da divisão
        
    }
    
    
    
    //Exercício 10 - Conversão de decimais para binários com concatenação de String
    public static String decToBin(int n)
    {
         if(n <= 1) 
        {
            return "" + n;
        }   
        return ""+ decToBin(n/2) +(n%2);
    }
    
    
    
    //Exercício de busca ordenada em arry 29.09
    public static int buscaBinaria(int arrayOrdenado[], int esquerda, int direita, int valorBuscado)
    {
        int meio = 0;

        while (esquerda <= direita)
        {
            
            meio = (esquerda + direita)/2;
            
            if (arrayOrdenado[meio] == valorBuscado) {
                return meio;
            } 
                else if (valorBuscado > arrayOrdenado[meio]) {
                        esquerda = meio + 1;
                }
                    else{
                        direita = meio - 1;
                    }
            
        }         
        
        return -1;
        
    }
    
    
    
    //Não é utilizado o parametro e sim a busca recursiva
   public static int buscaBinariaRecursiva(int[] arrayOrdenado, int esquerda, int direita, int valorBuscado)
    {
       int meio = (esquerda + direita)/2;
        
       if(direita < esquerda)
        {
            return -1;
        }
            if (arrayOrdenado[meio] == valorBuscado)
            {
                return meio;
            } 
                else if (valorBuscado > arrayOrdenado[meio])
                {
                    return buscaBinariaRecursiva(arrayOrdenado, meio + 1, direita ,valorBuscado);
                }
                    else
                    {
                        return buscaBinariaRecursiva(arrayOrdenado, esquerda, meio - 1, valorBuscado);
                    }
    }
    
}
/*
O dec2Bin é visto como uma pilha

                                     n    n%2       return
chamada 4        dec2Bin(1);         1
chamada 3        dec2Bin(3);         3
chamada 2        dec2Bin(6);         6
chamada 1        dec2Bin(12);       12
chamada 0        dec2Bin(12);

*/
