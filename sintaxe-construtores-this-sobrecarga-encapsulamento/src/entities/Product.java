package entities;

import exceptions.ProductException;

/* 						THIS
 *  -	Diferenciar atributos de vari�veis locais
� 	-   Passar o pr�prio objeto como argumento na chamada de um m�todo ou construtor
					 SOBRECARGA
		� um recurso que uma classe possui de oferecer mais de uma
	opera��o com o mesmo nome, por�m com diferentes listas de
	par�metros.
					 ENCAPSULAMENTO
	   Consiste emesconder detalhes de implementa��o de uma classe, expondo apenas  
     opera��es seguras e que mantenham os objetos em um estado consistente.
     
     Regra de ouro: o objeto deve sempre estar em um estado consistente, e a pr�pria classe deve garantir isso.
     
 
 */
public class Product {

	protected String name;
	private double price;
	private int quantity;

	// construtor - � uma opera��o especial da classe, que executa no momento da
	//instancia��o do objeto

	public Product() {
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}
	public Product(String name, double price, int quantity) {
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	public double totalValueInStock() {
		return price *quantity;
	}
	public void addProducts(int quantity) {
		this.quantity+=quantity;
	}
	public void removeProducts(int quantity) {
		this.quantity-=quantity;
	}
	public void validaQuantidade(int quantity) {
		if(quantity<0) {
			throw new ProductException();
		}
		this.quantity=quantity;
	}
	public String toString() {
		return "Name : "+name
				+" Pre�o: $"+String.format("%.2f", price)
				+" Quantidade: "+quantity
				+" Total: $"+String.format("%.2f", totalValueInStock());
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
}
