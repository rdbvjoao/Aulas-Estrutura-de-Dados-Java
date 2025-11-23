class Main {
    public static void main(String[] args)
    {
        //No no1 = new No(5);
        //System.out.println("no1 -> "+no1.dado);
        //no1.esquerda = new No(3);
        //no1.direita = new No(7);
        //System.out.println("esquerda no1 -> "+no1.esquerda.dado);
        //System.out.println("direita no1 -> "+no1.direita.dado);
 
        Arvore pessegueira = new Arvore();
        //System.out.println("Vazia: " + goiabeiraMaraviosa.vazia());
        pessegueira.inserir(20);
        pessegueira.inserir(30);
        pessegueira.inserir(15);
        pessegueira.inserir(2);
        pessegueira.inserir(1);
        pessegueira.inserir(0);
        pessegueira.inserir(25);
        pessegueira.inserir(40);


        pessegueira.imprimirPreOrdem(pessegueira.raiz);
        System.out.println();
        
        pessegueira.imprimirEmOrdem(pessegueira.raiz);
        System.out.println();
        
        pessegueira.imprimirEmOrdemDesc(pessegueira.raiz);
        System.out.println();
        
        pessegueira.imprimirPosOrdem(pessegueira.raiz);
        //System.out.println(pessegueira.raiz);
        //System.out.println(pessegueira.raiz.esquerda);
        //System.out.println(pessegueira.raiz.direita);
        
        
        
        
        int valorBuscado = 15;
        No auxiliar = pessegueira.buscar(pessegueira.raiz, valorBuscado);
        System.out.println();
        System.out.println();
        
        if (auxiliar == null)
            System.out.println("Valor "+valorBuscado+" não encontrado!");
        else
            System.out.println("Valor encontrado: "+auxiliar);
        
        
        System.out.println("Total de nós na árvore: "+pessegueira.contar(pessegueira.raiz));
    
        System.out.println("Altura da árvore: "+pessegueira.altura(pessegueira.raiz));

        System.out.println("Contagem folhas: "+pessegueira.contarFolhas(pessegueira.raiz));

        System.out.println("Maior valor pessegueira: " +pessegueira.maior(pessegueira.raiz));

        System.out.println("Menor valor pessegueira: " + pessegueira.menor(pessegueira.raiz));

        System.out.println("Buscar Pai pessegueira: " + pessegueira.buscarPai(pessegueira.raiz,2));

    }
}
 
