
public class TesteIR {
public static void main(String[] args) {
	double salario = 3300.0;
	double impostoRenda=0.0;
	if(salario >=1900.0 && salario<=2800.0) {
		  System.out.println("A sua aliquota � de 7%");
          System.out.println("Voc� pode deduzir at� R$ 142"); 
		  impostoRenda= salario*0.075;
	}else if(salario>= 2800.0 && salario<=3751.0) {
	     System.out.println("A sua aliquota � de 15%");
         System.out.println("Voc� pode deduzir at� R$ 350");
		 impostoRenda= salario*0.15;
	}else if(salario >=3751.01 && salario<=4664.00) {
		   System.out.println("A sua aliquota � de 22.5%");
           System.out.println("Voc� pode deduzir at� R$ 636");
		impostoRenda= salario*0.225;
	}
	System.out.println("Dedu��o � de : "+impostoRenda);
}
}
