import java.util.Arrays;

public class TestaVetor2 {

	public static void main(String[] args) {
		
		double v[]= {3.5,2.75,9,-4.5};
		
		Arrays.sort(v); // Opera��o para coloca o vetor em ordem
		
		for(double valor:v) {
			System.out.print(valor+" ");
		}
		//busca bin�ria, mostra a posicao q encontrou o valor
		int pos = Arrays.binarySearch(v, 2.75);
		System.out.println();
		System.out.println("Encontrei o valor "+v[1]+" \n Na posi��o : " +pos);
		System.out.println();
		//Preenchimento autom�tico com .fill
		System.out.println(" M�todo .Fill - Auto preenchimeto");
		int num []= new int[20];
		Arrays.fill(num, 8);
		for(int value : num) {
			System.out.print(value+" ");
		}
	}

}
