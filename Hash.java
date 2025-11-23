
public class Main
{
	public static void main(String[] args) {
		Hash nomes = new Hash(5);
		System.out.println("Tamanho: "+nomes.getTamanho());
		System.out.println("Capacidade: "+nomes.getCapacidade());

		
	/*	System.out.println("Chave: 200 - Hash(Indice):"+nomes.getHash(200));
		System.out.println("Chave: 100 - Hash(Indice):"+nomes.getHash(100+1));
		System.out.println("Chave: 521 - Hash(Indice):"+nomes.getHash(521));
		System.out.println("Chave: 102329 - Hash(Indice):"+nomes.getHash(102329));*/

		nomes.add(107, "Pedro");
		nomes.add(200, "Maria");
        nomes.add(100, "Ana");
		nomes.add(400, "Cristina");
		nomes.add(500, "Herique");
		nomes.add(524, "Raul");
		//nomes.add(1000, "Critina");
/*		//nomes.add(1, "Rafael");
		nomes.imprime();
		System.out.println("Tamanho: "+nomes.getTamanho());
		System.out.println(nomes.getValor(100));
		System.out.println(nomes.getValor(200));
		System.out.println(nomes.getValor(500));
		//System.out.println(nomes.getValor(1000));
*/
		nomes.imprime();
		System.out.println("Tamanho: "+nomes.getTamanho());

	}
}