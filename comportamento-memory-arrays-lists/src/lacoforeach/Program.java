package lacoforeach;

import java.util.Iterator;

public class Program {
	/*
	 * 					La�o "for each"
	Sintaxe opcional e simplificada para percorrer cole��es
	Sintaxe:
		for (Tipo apelido : cole��o) {
			<comando 1>
			<comando 2>
		}
	 */
	public static void main(String[] args) {
		
		String[] vect= new String[] {"Maria","Bob","Alex"};
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		for (String apelido : vect) { //"para cada string 'apelido' contido em vect, fa�a:"
			System.out.println(apelido);
		}
		
	}

}
