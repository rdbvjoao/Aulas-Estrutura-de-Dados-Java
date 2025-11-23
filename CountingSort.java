public class Main
{
	public static void main(String[] args) 
	{
		int A[] = {6, 4, 0, 4, 7, 7, 3, 2, 4, 1};
		int B[] = countingSort(A, 7+1);
		imprimir(B);
		
    	String D[] = {"329", "457","657","839","436","720","355"};
        String E[] = radix (D, 3);
        System.out.println("");
        imprimir(E);
		
	}

	public static void imprimir(String[] A) 
	{
		for (int i=0; i<A.length; i++)
			System.out.print(A[i]+" ");
	}

	public static void imprimir(int[] A) 
	{
		for (int i=0; i<A.length; i++)
			System.out.print(A[i]+" ");
	}


	public static int[] countingSort(int A[], int k) 
	{
		int n = A.length;
		int[] B = new int[n];
		int[] C = new int[k];
		for (int i=0; i<k; i++) C[i] = 0;
		for (int j=0; j<n; j++) C[A[j]]++;
		for (int i=1; i<k; i++) C[i] += C[i-1];
		for (int j=n-1; j>=0; j--) {
			B[C[A[j]]-1] = A[j];
			C[A[j]]--;
		}
		return B;
	}


	public static String[] radix(String[] A, int numDigitos)
	{
		for (int i=numDigitos-1; i>=0; i--) 
		{
			A = countingSort2(A, i, 256);
		}
		return A;
	}


	public static String[] countingSort2(String[] A, int digito, int k)
	{
		int n = A.length;
		String[] B = new String[n];
		int[] C = new int[k];
		
		for (int j=0; j<n; j++) C[A[j].charAt(digito)]++;
		for (int i=1; i<k; i++) C[i] += C[i-1];
		
		for (int j=n-1; j>=0; j--) 
		{
			B[C[A[j].charAt(digito)]-1] = A[j];
			C[A[j].charAt(digito)]--;
		}
		return B;
	}



}