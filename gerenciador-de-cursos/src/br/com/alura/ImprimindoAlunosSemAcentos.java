package br.com.alura;

import java.util.HashSet;
import java.util.Set;

public class ImprimindoAlunosSemAcentos {
	public static void main(String[] args) {

		Set<String> alunos = new HashSet<>();
		alunos.add("Paulo");
		alunos.add("Alberto");
		alunos.add("Pedro");    
		alunos.add("Nico");   
		
		
		for (String aluno : alunos) {
			System.out.println(aluno);
			/*  Nesse pequeno exemplo temos a prova que o Set n�o mant�m a ordem de inser��o. 
			 *  O Aluno Nico aparece como segundo elemento, mas foi adicionado por �ltimo no Set.
				Por causa disso tamb�m n�o temos os m�todos conhecidos de uma lista que usam a posi��o, 
				como lista.get(1) ou lista.remove(2). Como n�o h� uma sequ�ncia de elementos, 
				n�o existe uma posi��o definida. Imagine que o Set � um saco no qual voc� n�o conhece
				o pr�ximo elemento que sai.
			 */
		}
	}
}