public class Main {

    public static void main(String[] args) {
        int[] numeros = {7, 4, 3, 2};
        System.out.println("Vetor antes da ordenação:");
        imprimirVetor(numeros);

        //0 e numeros.length são os índices do vetor
        //Já o numeros é o array
        mergeSort(numeros, 0, numeros.length - 1);

        System.out.println("\nVetor após a ordenação:");
        imprimirVetor(numeros);
    }

    //Função auxiliar para imprimir o vetor
    public static void imprimirVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
    
    /**
     * Ordena um array de inteiros usando o algoritmo Merge Sort.
     *
     * @param vetor O array de inteiros a ser ordenado.
     * @param inicio O índice do primeiro elemento do subarray a ser ordenado.
     * @param fim O índice do último elemento do subarray a ser ordenado.
     */
    public static void mergeSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) { // Condição de parada da recursão
            int meio = (inicio + fim) / 2; // Encontra o ponto médio do subarray
            mergeSort(vetor, inicio, meio); // Ordena a primeira metade recursivamente
            mergeSort(vetor, meio + 1, fim); // Ordena a segunda metade recursivamente
            mesclar(vetor, inicio, meio, meio + 1, fim); // Mescla as duas metades ordenadas
        }
    }

    /**
     * Mescla dois subarrays ordenados em um único array ordenado.
     *
     * @param vetor O array contendo os subarrays a serem mesclados.
     * @param inicioA O índice do primeiro elemento do primeiro subarray.
     * @param fimA O índice do último elemento do primeiro subarray.
     * @param inicioB O índice do primeiro elemento do segundo subarray.
     * @param fimB O índice do último elemento do segundo subarray.
     */
    public static void mesclar(int[] vetor, int inicioA, int fimA, int inicioB, int fimB) {
        int[] auxiliar = new int[fimB - inicioA + 1]; // Array auxiliar para armazenar os elementos mesclados
        int indiceA = inicioA; // Índice do primeiro subarray
        int indiceAuxiliar = 0; // Índice do array auxiliar
        int indiceB = inicioB; // Índice do segundo subarray

        // Mescla os dois subarrays enquanto houver elementos em ambos
        while (indiceA <= fimA && indiceB <= fimB) {
            if (vetor[indiceA] < vetor[indiceB]) {
                auxiliar[indiceAuxiliar] = vetor[indiceA];
                indiceA++;
            } else {
                auxiliar[indiceAuxiliar] = vetor[indiceB];
                indiceB++;
            }
            indiceAuxiliar++;
        }

        // Copia os elementos restantes do primeiro subarray, se houver
        while (indiceA <= fimA) {
            auxiliar[indiceAuxiliar] = vetor[indiceA];
            indiceA++;
            indiceAuxiliar++;
        }

        // Copia os elementos restantes do segundo subarray, se houver
        while (indiceB <= fimB) {
            auxiliar[indiceAuxiliar] = vetor[indiceB];
            indiceB++;
            indiceAuxiliar++;
        }

        // Copia os elementos do array auxiliar de volta para o array original
        indiceAuxiliar = 0;
        for (int i = inicioA; i <= fimB; indiceAuxiliar++, i++) {
            vetor[i] = auxiliar[indiceAuxiliar];
        }
    }

}
