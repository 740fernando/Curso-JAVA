package br.com.alura;

public class Aluno {

	private String nome;
	private int numeroMatricula;

	public Aluno(String nome, int numeroMatricula) {
		if(nome==null) {
			throw new NullPointerException("Nome nao pode ser null");
		}
		this.nome = nome;
		this.numeroMatricula = numeroMatricula;
	}

	public String getNome() {
		return nome;
	}

	public int getNumeroMatricula() {
		return numeroMatricula;
	}
	@Override
	public boolean equals(Object obj) {
		Aluno outro = (Aluno)obj; //cast
		return this.nome.equals(outro.nome);
	}
	@Override
	public int hashCode() {
		//return this.nome.charAt(0);
		return this.nome.hashCode();
	}
	

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[Aluno : "+this.nome+" , matricula :  "+
		this.numeroMatricula+" ] ";
	}
	/*
	 * Vamos � explica��o: a estrutura Set usa uma tabela de espalhamento para realizar mais rapidamente
	 *  suas buscas. Imagine que cada vez que voc� adiciona algo dentro do seu Set para espalhar o
	 *  s objetos, um n�mero m�gico � gerado e todos os objetos que o tenham s�o agrupados. 
	 *  E ao buscar, em vez de comparar o objeto com todos os outros objetos contidos dentro do Set 
	 *  (isso daria muitas compara��es), ele gera novamente o mesmo n�mero m�gico, e compara apenas 
	 *  com aqueles que tamb�m tiveram como resultado esse n�mero. Ou seja, ele compara apenas dentro
	 *   do grupo de semelhan�a. No caso da matricula n�o reconhecida, o aluno a1 estava num grupo 
	 *   diferente de turini,   e por isso o m�todo contains n�o conseguia encontr�-lo.
	 */
}


