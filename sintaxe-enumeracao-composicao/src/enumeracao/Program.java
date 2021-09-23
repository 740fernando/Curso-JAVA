package enumeracao;

import java.util.Date;

/*
 * Enumera��es
� � um tipo especial que serve para especificar de forma literal um
conjunto de constantes relacionadas
� Palavra chave em Java: enum
� Vantagem: melhor sem�ntica, c�digo mais leg�vel e auxiliado pelo
compilador
 */
public class Program {
	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);

		//Convers�o de String para enum
		OrderStatus os1= OrderStatus.DEVILERED;
		OrderStatus os2= OrderStatus.valueOf("DEVILERED");
		
		Order order2 = new Order(1080, new Date(), os1);
		
		System.out.println("Convers�o de String para enum os1= OrderStatus.DEVILERED; : "+os1);
		System.out.println("Convers�o de String para enum os2 "+os2);
	}
}
