public class Main
{
	public static void main(String[] args)
	{
        Fila fila_pacientes = new Fila();
        
        fila_pacientes.inserir(10,'V');
        fila_pacientes.inserir(11,'V');
        fila_pacientes.inserir(5,'A');
        fila_pacientes.inserir(12,'V');
        fila_pacientes.inserir(6,'A');


        fila_pacientes.imprimir();
	}
}
