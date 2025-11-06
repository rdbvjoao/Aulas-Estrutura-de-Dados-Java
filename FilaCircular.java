public class Main
{
	public static void main(String[] args)
	{
	    FilaCircular senhas = new FilaCircular(4);
	    
	    senhas.enfileirar(6);
	    senhas.enfileirar(7);
	    senhas.enfileirar(8);
	    senhas.enfileirar(9);
	    senhas.enfileirar(10);

        senhas.imprimir();
        
        senhas.desenfileirar();
        System.out.println("Depois de desenfileirar!");
	
	    senhas.imprimir();
	    
        System.out.println("Depois de enfileirar!");
        senhas.enfileirar(16);
        senhas.imprimir();



	}
}
