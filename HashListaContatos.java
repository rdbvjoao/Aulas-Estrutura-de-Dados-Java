public class Main {

	public static void main(String[] args) {
		/*
		ListaDeContatos lista = new ListaDeContatos();
		lista.adiciona(new Contato("Zulmira","11 97890-0099"));
		lista.adiciona(new Contato("Pedro","11 97890-0001"));
		lista.adiciona(new Contato("Maria","11 97890-0002"));
		lista.adiciona(new Contato("Alex","11 97890-0003"));
		System.out.println(lista);

		System.out.println("Removido: "+lista.remove("Pedro"));
		System.out.println("Removido: "+lista.remove("Alex"));
		System.out.println("Removido: "+lista.remove("Zulmira"));
		System.out.println("Removido: "+lista.remove("Maria"));
		System.out.println(lista);
		*/
		TabelaDeContatos tabela = new TabelaDeContatos();
		for (int i =0; i < 26; i++) 
		{
			System.out.println((char)('a'+i)+"("+(97+i)+") = "+tabela.getHash((char)('a'+i)));
		}
		tabela.adiciona(new Contato("Zulmira","11 97890-0099"));
		tabela.adiciona(new Contato("Pedro","11 97890-0001"));
		tabela.adiciona(new Contato("Maria","11 97890-0002"));
		tabela.adiciona(new Contato("Antonio","11 97890-0004"));
		tabela.adiciona(new Contato("Alex","11 97890-0003"));
		tabela.adiciona(new Contato("Beatriz","11 97890-0005"));
		tabela.adiciona(new Contato("Bartolomeu","11 97890-0006"));
		tabela.adiciona(new Contato("Padro","11 9770-7372"));
		tabela.adiciona(new Contato("Plínio","11 99789-8687"));

		System.out.println(tabela);
	}

}
