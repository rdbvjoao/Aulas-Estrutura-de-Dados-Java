public class Main
{
	public static void main(String[] args) 
	{
        Pilha pilhaTarefas = new Pilha(10);
        
        System.out.println("Grau de prioridade:\nA - Urgente\nB - Sem urgência\n");
        //pilhaTarefas.visualizarTarefa();
        //pilhaTarefas.realizarTarefa();

        pilhaTarefas.inserirTarefa("Tarefa 1",'B');
        pilhaTarefas.inserirTarefa("Tarefa 2",'A');
        pilhaTarefas.inserirTarefa("Tarefa 4",'A');
        pilhaTarefas.inserirTarefa("Tarefa 3",'B');

        pilhaTarefas.visualizarTarefa();
        
        System.out.println();
        
        pilhaTarefas.inserirTarefa("Tarefa 8",'B');
        pilhaTarefas.inserirTarefa("Tarefa 9",'A');


        pilhaTarefas.visualizarTarefa();

        System.out.println("\nTarefa realizada: "+pilhaTarefas.realizarTarefa());
        System.out.println();
            
        pilhaTarefas.visualizarTarefa();

                
	}
}
/*

        pilhaTarefas.visualizarTarefa();
        pilhaTarefas.imprimir();
        pilhaTarefas.realizarTarefa();
        pilhaTarefas.realizarTarefa();

*/